package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportJavaConfig._1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(SgtPeppers sgtPeppers1) {
        return new CDPlayer(sgtPeppers1);
    }

}
