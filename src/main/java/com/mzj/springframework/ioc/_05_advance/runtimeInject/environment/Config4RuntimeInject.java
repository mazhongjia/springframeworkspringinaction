package com.mzj.springframework.ioc._05_advance.runtimeInject.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/16 12:48
 * @Version: 1.0
 */
@Configuration
@PropertySource("classpath:com/mzj/springframework/ioc/_05_advance/app.properties")
public class Config4RuntimeInject {

    @Autowired
    Environment environment;

    @Bean
    public MyBean createMyBean(){
        return new MyBean(environment.getProperty("abc"));
    }

}
