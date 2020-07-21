package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan({"com.bean" , "com.service"})
@PropertySource("classpath:Application.properties")
public class AppConfig {

}
