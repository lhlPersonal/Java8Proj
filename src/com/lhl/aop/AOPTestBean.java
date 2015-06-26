package com.lhl.aop;

import org.springframework.stereotype.Component;

@Component
public class AOPTestBean {
	public void DoWork() {
		System.out.println("do work");
	}

	public String DoWork1(String val) {
		return val;
	}
}
