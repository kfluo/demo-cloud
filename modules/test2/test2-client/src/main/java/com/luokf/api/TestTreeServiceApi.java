/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.luokf.api;

import com.luokf.entity.TestTree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 测试数据Service
 * @author ThinkGem
 * @version 2018-10-18
 */
@RequestMapping(value = "/api/test2/testTree")
public interface TestTreeServiceApi {
	
	/**
	 * 获取单条数据
	 * @return
	 */
	@GetMapping(value = "getByPk")
	public TestTree get(@RequestParam("id") String id);
	
	/**
	 * 获取单条数据
	 * @return
	 */
	@GetMapping(value = "getByPkAndIsNewRecord")
	public TestTree get(@RequestParam("id") String id, @RequestParam("isNewRecord") boolean isNewRecord);
	
	/**
	 * 根据父节点单条数据
	 * @param testTree
	 * @return
	 */
	@GetMapping(value = "getLastByParentCode")
	public TestTree getLastByParentCode(TestTree testTree);
	
	/**
	 * 查询分页数据
	 * @param testTree
	 * @return
	 */
	@PostMapping(value = "findList")
	public List<TestTree> findList(TestTree testTree);
	
	/**
	 * 查询数据总数
	 * @param testTree
	 * @return
	 */
	@PostMapping(value = "findCount")
	public long findCount(TestTree testTree);
	
	/**
	 * 保存数据（插入或更新）
	 * @param testTree
	 */
	@PostMapping(value = "save")
	public void save(TestTree testTree);
	
	/**
	 * 更新状态
	 * @param testTree
	 */
	@PostMapping(value = "updateStatus")
	public void updateStatus(TestTree testTree);
	
	/**
	 * 删除数据
	 * @param testTree
	 */
	@PostMapping(value = "delete")
	public void delete(TestTree testTree);
	
	/**
	 * 修复树结构数据
	 */
	@PostMapping(value = "fixTreeData")
	public void fixTreeData();
	
}