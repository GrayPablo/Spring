package com.curso.ejemploaroundadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdviceExample implements MethodInterceptor {
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println(" Advice Before method");
		Object obj= method.proceed();
		System.out.println("Advice After Method");
		return null;
	}

}
