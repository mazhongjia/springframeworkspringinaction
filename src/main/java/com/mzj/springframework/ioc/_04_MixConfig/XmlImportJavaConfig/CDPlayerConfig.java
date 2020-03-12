package com.mzj.springframework.ioc._04_MixConfig.XmlImportJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(SgtPeppers sgtPeppers1) {
        return new CDPlayer(sgtPeppers1);
    }

}
