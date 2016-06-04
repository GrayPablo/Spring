package com.curso.ejemploaroundadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AroundAdviceTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");

        SimpleInterface simpleInterface = (SimpleInterface) applicationContext.getBean("proxyBean");

        simpleInterface.testMethod();
    }
}
