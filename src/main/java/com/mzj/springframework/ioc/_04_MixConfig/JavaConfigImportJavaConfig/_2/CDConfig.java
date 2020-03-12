package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportJavaConfig._2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
  @Bean
  public SgtPeppers compactDisc() {
    return new SgtPeppers();
  }
}