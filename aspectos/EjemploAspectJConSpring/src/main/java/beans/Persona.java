/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.springframework.stereotype.Component;

/**
 *
 * @author Administrador
 */
@Component
public class Persona {
    private String nombre="abc";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
