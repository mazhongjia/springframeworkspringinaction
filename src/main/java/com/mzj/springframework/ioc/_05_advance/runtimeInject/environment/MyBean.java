package com.mzj.springframework.ioc._05_advance.runtimeInject.environment;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/16 12:51
 * @Version: 1.0
 */
public class MyBean {

    private String message;

    public MyBean(String message){
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
