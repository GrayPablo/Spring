package com.curso.ejemplobeforeadvice;



import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdviceExample implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("Hello world! (by " + this.getClass().getName()
				+ ")");
	}
}