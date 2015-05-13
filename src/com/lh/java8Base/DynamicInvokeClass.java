package com.lh.java8Base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicInvokeClass {
	public static void main(String[] args) {
		proxyFactory().actionA();
		proxyFactory().actionC();
	}

	public static A proxyFactory() {
		return (A) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				new Class[] { A.class }, new AHandler(new SubA()));
	}
}

interface A {
	public void actionA();

	public void actionB();

	default public void actionC() {
		System.out.println("Default actionC");
	}

	public static void actionD() {
		System.out.println("Static method actionD");
	}
}

class AHandler implements InvocationHandler {
	private Object tObject;

	public AHandler(Object t) {
		this.tObject = t;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Before Action");
		method.invoke(this.tObject, args);
		System.out.println("After Action");
		return null;
	}
}

class SubA implements A {
	public void actionA() {
		System.out.println("Implements interface actionA");
	}

	public void actionB() {
		System.out.println("Implements interface actionB");
	}
}

