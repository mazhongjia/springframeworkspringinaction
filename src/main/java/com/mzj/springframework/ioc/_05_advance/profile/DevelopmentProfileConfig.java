package com.mzj.springframework.ioc._05_advance.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {

    @Bean
    public DataSource dataSource(){
        EmbeddedDatabase embeddedDatabase = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:com/mzj/springframework/ioc/_05_advance/schema.sql")
                .addScript("classpath:com/mzj/springframework/ioc/_05_advance/test-data.sql")
                .build();
        return embeddedDatabase;
    }
}
