package com.lhl.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		loadSpringXml();
	}

	@SuppressWarnings({ "resource", "unused" })
	public static void loadSpringXml() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		AOPTestBean atb = context.getBean(AOPTestBean.class);
		atb.DoWork();
		atb.DoWork1("param 1");
	}
}
