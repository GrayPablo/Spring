package com.curso.java.springaspectjconfig;

import com.curso.java.aspectos.AspectoTest;
import com.curso.java.config.ConfiguracionGlobal;
import com.curso.java.servicios.TestServicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfiguracionGlobal.class);        
        System.out.println("Contexto cargado");
        TestServicio servicio = ctx.getBean(TestServicio.class);
        System.out.println(servicio);
        AspectoTest aspecto = ctx.getBean(AspectoTest.class);
        System.out.println(aspecto);
        servicio.daIgual();
        System.out.println("Fin del programa");
    }
}
