package com.first.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import java.sql.SQLException;

/**
 * @author 黄小爷
 * @description
 */
@Configuration
public class DruidConfig {
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean<Servlet> registrationBean=new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean registrationBean() throws SQLException {
        FilterRegistrationBean registrationBean=new FilterRegistrationBean(new WebStatFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("exclusion","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return registrationBean;
    }
}
