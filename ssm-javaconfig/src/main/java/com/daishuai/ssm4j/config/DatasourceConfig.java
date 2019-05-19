package com.daishuai.ssm4j.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/21 15:38
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Configuration
@PropertySource("classpath:properties/datasource.properties")
@MapperScan("com.daishuai.ssm4j.mapper")
public class DatasourceConfig {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        return dataSource;
    }

    /**
     * Mybatis配置
     * @return
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setTypeAliasesPackage("com.daishuai.ssm4j.domain");
        /*try {
            sqlSessionFactory.setMapperLocations(resourcePatternResolver.getResources("classpath:com/daishuai/ssm4j/mapper/*.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return sqlSessionFactory;
    }

    /**
     * 事务管理器
     * @return
     */
    @Bean(name = "datasourceTransactionManager")
    public PlatformTransactionManager datasourceTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource());

        return transactionManager;
    }

    /**
     * 事务支持
     * @return
     */
    @Bean(name = "transactionInterceptor")
    public TransactionInterceptor transactionInterceptor() {
        TransactionInterceptor interceptor = new TransactionInterceptor();
        interceptor.setTransactionManager(datasourceTransactionManager());
        Properties transactionAttributes = new Properties();
        transactionAttributes.setProperty("save*","PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("insert*", "PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("delete*", "PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("update*", "PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("add*", "PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("select*", "PROPAGATION_SUPPORTS,readOnly");
        transactionAttributes.setProperty("get*", "PROPAGATION_SUPPORTS,readOnly");
        transactionAttributes.setProperty("find*", "PROPAGATION_SUPPORTS,readOnly");
        interceptor.setTransactionAttributes(transactionAttributes);
        return interceptor;
    }

}
