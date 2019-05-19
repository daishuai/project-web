package com.daishuai.ssm4j.config;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/1/21 15:30
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@Configuration
@ComponentScan(basePackages = {"com.daishuai.ssm4j.config", "com.daishuai.ssm4j.web.service"})
@Import(DatasourceConfig.class)
public class RootConfig {

    /**
     * 第一种最简单的方式，在 RootConfig 加上 @EnableTransactionManagement 注解，
     * 再加上配置 DataSourceTransactionManager 的bean，就可以在service实现层使用 @Transactional
     * 注解为方法手动加上事务，并且指定的传播属性等等，但老是要手动加 @Transactional 注解实在麻烦
     * 第二种就是文中使用的方式，使用 BeanNameAutoProxyCreator 拦截代理方式，
     * 先创建一个 TransactionInterceptor bean，配置好事务传播等属性，
     * 在由 BeanNameAutoProxyCreator 进行事务代理。这里有个问题就是 BeanNameAutoProxyCreator
     * 放在 RootConfig 中居然会导致 @value注解获取不到配置文件的值，而是键名字，将它直接放到 RootConfig 下就没事了
     * 第三种是采用aop切面事务， @EnableAspectJAutoProxy 开启切面自动代理，
     * 这里写一个切面相关类 AspectConfig ，然后在 使用 @Import(AspectConfig.class) 导进配置就行，
     * 由于 <tx: 开头的这种标签实在不知如何用java方式表示，在 stackoverflow
     * 看到一个答案讲还是只能写一个xml文件，使用 @ImportResource(“classpath:/aop-config.xml”)
     * 这种方式进行配置，具体实现如下(三种方式根据需要去掉无关代码，免得出冲突)
     * @return
     */
    @Bean
    public BeanNameAutoProxyCreator proxyCreator() {
        BeanNameAutoProxyCreator proxyCreator = new BeanNameAutoProxyCreator();
        proxyCreator.setProxyTargetClass(true);
        proxyCreator.setBeanNames("*Service");
        proxyCreator.setInterceptorNames("transactionInterceptor");
        return proxyCreator;
    }
}
