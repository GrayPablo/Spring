package com.curso.spring.springaspectos0001.dominio;

import java.io.Serializable;

public class PersonaImpl implements Serializable, Persona {

    private String nombre;

    public PersonaImpl() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
