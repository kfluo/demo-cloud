/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.luokf.client;

import com.luokf.api.TestTreeServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Date: 2019-08-13 14:28
 * @Author: luokf
 */
@FeignClient(name="${service.test2.name}", path="${service.test2.path}")
public interface TestTreeServiceClient extends TestTreeServiceApi {
	
}
