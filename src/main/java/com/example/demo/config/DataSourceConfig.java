package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @author 黄腾
 * @Date 2017/12/6-20:45
 * @function
 */

@Configuration
public class DataSourceConfig {
    @Bean(name = "datasource")
    public DataSource dataSource(Environment env){
        HikariDataSource ds=new HikariDataSource();
        ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
        ds.setUsername(env.getProperty("spring.datasource.username"));
        ds.setPassword(env.getProperty("spring.datasource.password"));
        ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        System.out.println("hellpzaza");
        return  ds;
    }

}
