package com.curso.ejemploafterthrowingadvice;

public class InterfaceSimpleImpl implements InterfaceSimple {
        @Override
	public void metodoSimple(){
		System.out.println(" ******* En SimpleMethod() of clase "+ this.getClass().getName() +" ******* ");
		throw new RuntimeException();
	}
}
