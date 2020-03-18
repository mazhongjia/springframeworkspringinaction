package com.mzj.springframework.ioc._05_advance.runtimeInject.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/16 12:51
 * @Version: 1.0
 */
@Component
public class MyBean {

    private String message;

    /**
     * spEL引用外部properties配置文件
     *
     * 这里的configProperties对应spEL.xml的bean的id
     * @param message
     */
    public MyBean(@Value("#{configProperties['abc']}") String message){
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyBean{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
