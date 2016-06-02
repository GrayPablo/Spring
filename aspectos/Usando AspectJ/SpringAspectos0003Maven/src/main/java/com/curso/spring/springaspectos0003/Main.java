/*
 * Main.java
 *
 * Created on 26 de junio de 2007, 12:51
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.spring.springaspectos0003;

import com.curso.spring.dominio.Cliente;
import com.curso.spring.dominio.Cuenta;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.curso.spring.servicio.ServicioCliente;

/**
 *
 * @author Administrador
 */
public class Main {

    private ClassPathXmlApplicationContext ctx;

    /**
     * Creates a new instance of Main
     */
    public Main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.init();
        m.forzarEjecucionAspectos();
    }

    private void init() {
        String[] paths = {"recursos/applicationContext.xml", "recursos/aspectosContext.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        System.out.println("Contexto cargado");
    }

    private void forzarEjecucionAspectos() {
        ServicioCliente sc = (ServicioCliente) ctx.getBean("servicioCliente");
        sc.ingresar(new Cliente(), new Cuenta(), 6000.0d);
        sc.reintegrar(new Cliente(), new Cuenta(), 5000.0d);
    }
}
