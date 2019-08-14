package com.luokf.dao;

import com.luokf.entity.TestData;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDataDAO {

    TestData getById(String id);
}