/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.sprin.beans;

/**
 *
 * @author Alejandra
 */
public class PersonaImpl implements Persona {

    private String nombre = "Un nombre cualquiera";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
