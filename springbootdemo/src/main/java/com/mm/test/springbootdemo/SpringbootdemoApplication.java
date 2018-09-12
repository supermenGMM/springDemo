package com.mm.test.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.mm"})
@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
