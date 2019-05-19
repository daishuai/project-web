package com.daishuai.boot.springbootwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author daishuai
 */
@SpringBootApplication
public class SpringbootWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootWebserviceApplication.class);
        ConfigurableApplicationContext context = application.run(args);
        //SpringApplication.run(SpringbootWebserviceApplication.class, args);
    }
}
