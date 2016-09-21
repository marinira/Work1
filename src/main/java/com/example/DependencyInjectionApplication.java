package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication
{
	public static void main(String[] args)
	{
		ApplicationContext ctc =  SpringApplication.run(DependencyInjectionApplication.class, args);
		HelloBean helloBean = ctc.getBean(HelloBean.class);

		System.out.println(helloBean.sayHello());

	}
}
