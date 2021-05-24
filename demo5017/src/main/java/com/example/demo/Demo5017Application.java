package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo5017Application {

	public static void main(String[] args) {
//		System.out.println("abc");
		ConfigurableApplicationContext context=SpringApplication.run(Demo5017Application.class, args);
		Alien a=context.getBean(Alien.class);
		a.show();
//		Alien a1=context.getBean(Alien.class);
//		a1.show();
	}

}
