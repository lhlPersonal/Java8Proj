package com.lh.java8Base;

import java.io.PrintStream;
import java.util.Comparator;

public class JavaBasicTest {
	public static void main(String[] args) {
		staticFieldTest();
	}

	public static void staticFieldTest() {
		System.out.println("Starting Main");
		System.out.println("After echo");
		System.out.println("After field access");
		System.out.println(B.y + A1.x);
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