package com.mm.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateUtil {
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.primary")
    public DataSourceProperties primaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.second")
    public DataSourceProperties secondaryDataSourceProperties() {
        return  new DataSourceProperties();
    }

    @Primary
    @Bean(name = "primaryDataSource")
    public DataSource primaryDatasource() {
        return  primaryDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "secondayDataSource")
    public DataSource secnodDatasource() {
        return secondaryDataSourceProperties().initializeDataSourceBuilder().build();
    }

}
