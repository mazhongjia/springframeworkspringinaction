package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.adviceArgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/24 13:11
 * @Version: 1.0
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public SingASong singASong(){
        return new SingASongImpl();
    }

    @Bean
    public Audience4AroundArgs audience1() {
        return new Audience4AroundArgs();
    }
}
