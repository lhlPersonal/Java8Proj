package com.lh.java8Base;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.validator.Var;

public class JavaBasicTest {
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();

		for (int i = 0; i < 101; i++) {
			es.submit(() -> {
				run();
			});
		}
	}

	

	public static void staticFieldTest() {
		System.out.println("Starting Main");
		System.out.println("After echo");
		System.out.println("After field access");
		System.out.println(B.y + A1.x);

	}

	private static int ticket = 100;

	public static synchronized void run() {
		if (ticket > 0) {
			System.out.println(ticket + " is saled by "
					+ Thread.currentThread().getName());
			ticket--;
		}
	}

	public static int f(String s) {
		System.out.println(s);
		return 1;
	}
}

class B {
	public static int y = JavaBasicTest.f("Init B");
}

class A1 {
	public static int x = JavaBasicTest.f("Init A");
}

class CC<T> implements Comparable<String> {
	public int compareTo(String o) {
		return 0;
	}
}

class SubCC extends CC<F> {
}

class F implements Comparator<CC<String>> {
	public int compare(CC<String> o1, CC<String> o2) {
		return 0;
	}
}