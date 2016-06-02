/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.beans;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Persona {

    private String nombre = "Un nombre cualquiera";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.nombre = nombre;
    }
}
