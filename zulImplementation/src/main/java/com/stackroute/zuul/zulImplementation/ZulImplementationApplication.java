package com.stackroute.zuul.zulImplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZulImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZulImplementationApplication.class, args);
	}

}
