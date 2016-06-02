/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.springaspectos0004;

import com.curso.spring.beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] paths = {"recursos/applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
        Persona p = (Persona) ctx.getBean("persona");
        p.setNombre("uno");
    }
}
