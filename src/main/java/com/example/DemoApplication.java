package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL) // This one breaks it
public class DemoApplication {

    @Configuration
    protected static class CustomRepositoryRestMvcConfiguration extends RepositoryRestConfigurerAdapter {
        /* Autowiring a Validator breaks it (different error)
        @Autowired
        private Validator deviceValidator;
        */
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
