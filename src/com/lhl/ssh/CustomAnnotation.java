package com.lhl.ssh;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Target({ ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@interface Car {

}

@Target({ ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@interface Car2 {

}

interface A2 {
	void OutMsg();
}

@Car
class B1 implements A2 {

	@Override
	public void OutMsg() {
		System.out.println("B1");
	}
}

@Car2
class B2 implements A2 {

	@Override
	public void OutMsg() {
		System.out.println("B2");
	}
}

@Component
class C {

	@javax.inject.Inject
	@Car2
	private A2 a;

	public void show() {
		a.OutMsg();
	}
}