package com.mzj.springframework.aop._03_condition;

import org.springframework.context.annotation.*;

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
    @Conditional(MyCondition.class)
    public Audience4AroundArgs audience1() {
        return new Audience4AroundArgs();
    }
}
