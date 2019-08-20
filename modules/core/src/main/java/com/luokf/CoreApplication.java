package com.luokf;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringCloudApplication
@EnableFeignClients(basePackages={"com.luokf"})
public class CoreApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}
}