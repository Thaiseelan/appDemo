package com.example.appDemo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppDemoApplication {

	private static ConfigurableApplicationContext ApplicationContext;

	public static void main(String[] args) {
		ApplicationContext = SpringApplication.run(AppDemoApplication.class, args);

	}

}
