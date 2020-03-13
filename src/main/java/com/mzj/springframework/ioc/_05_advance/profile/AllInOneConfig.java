package com.mzj.springframework.ioc._05_advance.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DevelopmentProfileConfig.class,ProductionProfileConfig.class})
public class AllInOneConfig {

}
