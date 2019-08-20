package com.luokf.controller;

import com.luokf.client.TestDataServiceClient;
import com.luokf.entity.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @CreateTime: 2019-08-20 09:43
 * @Author: luokf
 */
@RestController
@RequestMapping("test2/testData")
public class Test2DataController {

    @Autowired(required = false)
    private TestDataServiceClient testDataServiceClient;

    @RequestMapping("getTestDataFromTest1")
    public TestData getTestDataFromTest1(String id){
        final TestData testData = testDataServiceClient.getById(id);
        return testData;
    }

}
