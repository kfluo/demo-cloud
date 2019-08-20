package com.luokf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients(basePackages={"com.luokf"})
public class Test2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Test2Application.class, args);
	}
	
}