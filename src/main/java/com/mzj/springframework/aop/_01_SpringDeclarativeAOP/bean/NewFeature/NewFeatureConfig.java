package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class NewFeatureConfig {

    @Bean
    public NewFeatureAspect newFeatureAspect() {
        return new NewFeatureAspect();
    }

}
