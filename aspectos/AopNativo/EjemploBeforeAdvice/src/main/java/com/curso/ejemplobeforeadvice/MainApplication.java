package com.curso.ejemplobeforeadvice;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("app.xml");
        SimpleInterface simpleInterface = (SimpleInterface) appContext.getBean("proxyBean");
        simpleInterface.hello();
        simpleInterface.show();
    }
}
