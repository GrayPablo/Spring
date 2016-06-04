package com.curso.ejemploafterthrowingadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAfterThrowingAdvice {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");

        InterfaceSimple simpleInterface = (InterfaceSimple) applicationContext.getBean("proxyBean");
        try {
            simpleInterface.metodoSimple();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
