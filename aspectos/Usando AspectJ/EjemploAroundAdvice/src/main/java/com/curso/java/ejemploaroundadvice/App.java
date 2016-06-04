package com.curso.java.ejemploaroundadvice;

import com.curso.java.aspectos.AspectoTest;
import com.curso.java.config.ConfiguracionGlobal;
import com.curso.java.modelo.Persona;
import com.curso.java.servicios.TestServicio;
import static java.lang.System.out;
import java.util.Arrays;
import org.springframework.beans.BeansException;
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
        testAroundAdvice(ctx);
        testNombresBeans(ctx);
        System.out.println("Fin del programa");
    }

    private static void testAroundAdvice(ApplicationContext ctx) throws BeansException {
        TestServicio servicio = ctx.getBean(TestServicio.class);
        System.out.println(servicio);
        AspectoTest aspecto = ctx.getBean(AspectoTest.class);
        System.out.println(aspecto);
        servicio.daIgual();
        servicio.laFecha("La fecha es ");
    }

    private static void testNombresBeans(ApplicationContext ctx) {
        Persona persona1 = ctx.getBean(Persona.class);
        Persona persona2 = ctx.getBean(Persona.class);
        String[] nombres = ctx.getBeanNamesForType(Persona.class);
        Arrays.asList(nombres).forEach(out::println);
    }
}
