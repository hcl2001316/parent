package com.first.config;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

/**
 * @author 黄小爷
 * @description
 */

@Configuration
public class MyDruidDataSource {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    DruidDataSource dateSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setFilters("stat");
        return dataSource;
    }
}
