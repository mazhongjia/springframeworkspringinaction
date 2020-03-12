package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    //​​​​​​​说明：有@Bean注解的方法接受一个SgtPeppers作为参数，因此SgtPeppers将会装配进来，此时与它是通过XML配置的没有任何关系
    // 只要通过某种方式（
    // ①通过组件扫描获得的：XML<context:component-scan>或者JavaConfig的@ComponentScan注解
    //②通过JavaConfig配置的——@Bean注解
    //③通过XML中配置的——<bean>标签）
    // 加入到spring容器中，就可以被spring装配。
    @Bean
    public CDPlayer cdPlayer(SgtPeppers sgtPeppers1) {
        return new CDPlayer(sgtPeppers1);
    }

}
