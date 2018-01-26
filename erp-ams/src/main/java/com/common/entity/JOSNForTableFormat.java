package com.common.entity;

import java.util.ArrayList;

public class JOSNForTableFormat {

	private String code;
	private String msg;
	private Integer count;
	private ArrayList data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public ArrayList getData() {
		return data;
	}
	public void setData(ArrayList data) {
		this.data = data;
	}
	//构造函数
	public JOSNForTableFormat(String code, String msg, Integer count, ArrayList data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}
	
	
}