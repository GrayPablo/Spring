/*
 * Main.java
 *
 * Created on 5 de junio de 2007, 12:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.curso.springdaojpa;

import com.curso.springdaojpa.beans.entidad.Comercial;
import com.curso.springdaojpa.beans.entidad.Contacto;
import com.curso.springdaojpa.servicio.ServicioCliente;
import java.util.Collection;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class Main {
    private ClassPathXmlApplicationContext ctx;
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.init();
        m.ejecutarSpringJpa();
        m.ejecutarSpringJpaRelaciones();
    }
    
    private void init() {
        String[] paths = {"applicationContext.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        System.out.println("Contexto cargado");
    }
    
    private void ejecutarSpringJpa() {
        ServicioCliente servicio = (ServicioCliente) ctx.getBean("servicioCliente");
        final Integer MAX_ELEMENTOS = 5;
        for(int i = 0; i < MAX_ELEMENTOS; i++) {
            servicio.insertarContacto(new Contacto("Nombre" + System.currentTimeMillis()));
        }
        Collection<Contacto> todosContactos = servicio.getTodosLosContactos();
        System.out.printf("se han encontrado %d contactos\n",todosContactos.size());
        for (Contacto contacto : todosContactos) {
            System.out.printf("El nombre del contacto es %s y su clave es %d\n",contacto.getNombre(), contacto.getId());
        }
        for(int i = 0; i < MAX_ELEMENTOS; i++) {
            servicio.insertarComercial(new Comercial("Nombre" + System.currentTimeMillis()));
        }
        Collection<Comercial> todosComerciales = servicio.getTodosLosComerciales();
        System.out.printf("se han encontrado %d comerciales\n",todosComerciales.size());
        for (Comercial comercial : todosComerciales) {
            System.out.printf("El nombre del comercial es %s y su clave es %d\n",comercial.getNombre(), comercial.getId());
        }
        
    }
    
    private void ejecutarSpringJpaRelaciones() {
        Comercial comercial = new Comercial("Comercial con contactos" + System.currentTimeMillis());
        Contacto contacto = new Contacto("Contacto para un comercial" + System.currentTimeMillis());
        ServicioCliente servicio = (ServicioCliente) ctx.getBean("servicioCliente");
        servicio.asignarContacto(comercial,contacto);
        List<Contacto> contactos = servicio.getContactosDeUnComercial(comercial);
        System.out.printf("se han encontrado %d contactos\n",contactos.size());
        for (Contacto elem : contactos) {
            System.out.printf("El nombre del contacto es %s y su clave es %d\n",elem.getNombre(), elem.getId());
        }
    }
    
}
