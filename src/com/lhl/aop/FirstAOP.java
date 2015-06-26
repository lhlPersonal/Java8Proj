package com.lhl.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class FirstAOP {
	@Pointcut("within(com.lhl.aop.AOPTestBean)")
	private void MyPointcut() {
		System.out.println("my pointcut defined.");
	}

	@Before(value = "MyPointcut()")
	public void Before() {
		System.out.println("before method invoke.");
	}

	@After(value = "MyPointcut()")
	public void After() {
		System.out.println("after method invoke.");
	}

	@AfterReturning(pointcut = "MyPointcut()", returning = "ret")
	public void AfterReturning(Object ret) {
		System.out.println(ret);
	}
}
