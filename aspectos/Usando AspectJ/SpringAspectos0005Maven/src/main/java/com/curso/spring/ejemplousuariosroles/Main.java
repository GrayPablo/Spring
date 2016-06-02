/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.ejemplousuariosroles;

import com.curso.spring.beans.Usuario;
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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        Usuario u = ctx.getBean(Usuario.class);
        System.out.println(u);
        u.setNombre("xyz");
        System.out.println(u);
    }
}
