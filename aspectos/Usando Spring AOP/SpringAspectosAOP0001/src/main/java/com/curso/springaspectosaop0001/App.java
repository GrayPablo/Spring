package com.curso.springaspectosaop0001;

import com.curso.springaspectosaop0001.beans.Servicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("principal.xml");
        System.out.println("Contexto cargado");
        Servicio servicio = context.getBean(Servicio.class);
        System.out.println(servicio.obtenerMensaje());
        System.out.println(servicio.conParametro(10));
        System.out.println(servicio.obtenerTiempo());
        try{
            servicio.lanzarExcepcion();
        }catch(UnsupportedOperationException e){
            System.out.println("Se producido un error: " + e);
        }
        servicio.metodoLento();
    }
}
