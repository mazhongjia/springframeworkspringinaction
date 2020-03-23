package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy//在配置类的类级别上通过使 用EnableAspectJ-AutoProxy注解启用自动代理功能
public class ConcertConfig {

    /**
     * 使用自动扫描：ComponentScan，并不会自动创建切面，所以需要通过@Bean进行创建  或者 在切面类增加@Component注解也行~~~~
     * @return
     */
    @Bean
    public Audience1 audience1() {
        return new Audience1();
    }

//    @Bean
//    public Audience2 audience2() {
//        return new Audience2();
//    }
}
