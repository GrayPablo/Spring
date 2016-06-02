/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.beans;

import com.curso.spring.anotaciones.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrador
 */
@Component
public class Usuario {

    @Value("#{test.nombrePersona}")
    private String nombre;
    @Autowired
    private List<Rol> roles;

    @Curso
    public String getNombre() {
        return nombre;
    }

    @Curso
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + " y mis roles son " + roles;
    }
}
