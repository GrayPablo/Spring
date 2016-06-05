/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejemploaspectj;

import beans.Mensaje;
import beans.Mensajero;
import beans.Persona;
import config.Configuracion;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        sinSpring();
        conSpring();
    }

    private static void conSpring() throws BeansException {
        System.out.println("CON SPRING*****************************************************");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
        Persona persona = ctx.getBean(Persona.class);
        System.out.println(persona);
        System.out.println("Fin");
    }

    private static void sinSpring() {
        System.out.println("SIN SPRING*****************************************************");
        Mensaje mensaje = new Mensaje();
        mensaje.setTexto("abc");
        System.out.println("Texto del mensaje: " + mensaje.getTexto());
        Mensajero mensajero = new Mensajero();
        mensajero.entregar("Mensaje uno");
        mensajero.entregar("Una persona", "Mensaje dos");
    }

}
