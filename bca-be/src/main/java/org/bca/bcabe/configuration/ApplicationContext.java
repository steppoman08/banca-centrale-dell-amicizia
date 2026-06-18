package org.bca.bcabe.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"org.bca.bcabe.service.impl"})
@EnableJpaRepositories(basePackages = "org.bca.bcabe.repository")
public class ApplicationContext {

}
