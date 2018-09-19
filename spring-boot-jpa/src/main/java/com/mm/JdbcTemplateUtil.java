package com.mm;

import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateUtil {
    @Bean
    public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDatasource")
        DataSource dataSource ){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public JdbcTemplate seconedJdbcTemplate(@Qualifier("secondDatasource")
                                                    DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
