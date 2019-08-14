package com.luokf.api;

import com.luokf.entity.TestData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/api/test1/testData")
public interface TestDataServiceApi {
	
	/**
	 * 获取单条数据
	 * @return
	 */
	@GetMapping(value = "getByPk")
	public TestData get(@RequestParam("id") String id);

}