package com.luokf.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="luokf-cloud-module-test1", contextId="TestDataServiceClient")
public interface TestDataServiceClient{
	
}
