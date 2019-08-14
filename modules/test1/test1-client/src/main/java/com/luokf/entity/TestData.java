package com.luokf.entity;
import lombok.Data;

import java.util.Date;
@Data
public class TestData{
	
	private static final long serialVersionUID = 1L;
	private String testInput;		// 单行文本
	private String testTextarea;		// 多行文本
	private String testSelect;		// 下拉框
	private String testSelectMultiple;		// 下拉多选
	private String testRadio;		// 单选框
	private String testCheckbox;		// 复选框
	private Date testDate;		// 日期选择
	private Date testDatetime;		// 日期时间
	private String testAreaCode;		// 区域选择
	private String testAreaName;		// 区域名称

}