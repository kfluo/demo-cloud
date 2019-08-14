package com.luokf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Date: 2019-08-12
 * @Author: luokf
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	private  static final Logger LOGGER = LoggerFactory.getLogger(EurekaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
        LOGGER.info("Spring Eureka Start Success");
	}
	
}