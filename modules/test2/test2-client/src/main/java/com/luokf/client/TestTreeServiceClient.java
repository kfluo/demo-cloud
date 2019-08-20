package com.luokf.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Date: 2019-08-13 14:28
 * @Author: luokf
 */
@FeignClient(name="luokf-cloud-module-test2", path="TestTreeServiceClient")
public interface TestTreeServiceClient {
	
}
