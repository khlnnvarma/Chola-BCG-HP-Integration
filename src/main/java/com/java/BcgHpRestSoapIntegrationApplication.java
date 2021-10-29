package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BcgHpRestSoapIntegrationApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext configurableApplicationContext=	SpringApplication.run(BcgHpRestSoapIntegrationApplication.class, args);
	
	configurableApplicationContext.close();
	
	int a=1;
	int b=2;
	System.out.println(a+b);
	}

}
