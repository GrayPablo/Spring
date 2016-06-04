package com.curso.ejemploafterthrowingadvice;

import org.springframework.aop.ThrowsAdvice;

public class EjemploAfterThrowingAdvice implements ThrowsAdvice
{
	public void afterThrowing(RuntimeException runtimeException) {
		System.out.println(" ******* Dentro de un Throws Advice ******* ");
		
	}
}

