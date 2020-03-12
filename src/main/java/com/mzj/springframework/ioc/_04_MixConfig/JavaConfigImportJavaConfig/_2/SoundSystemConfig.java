package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportJavaConfig._2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
public class SoundSystemConfig {

}
