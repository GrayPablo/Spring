/*
 * ServicioCliente.java
 *
 * Created on 6 de junio de 2007, 12:35
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.springdaojpa.servicio;

import com.curso.springdaojpa.beans.entidad.Comercial;
import com.curso.springdaojpa.beans.entidad.Contacto;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author user
 */
public interface ServicioCliente {

    void asignarContacto(Comercial comercial, Contacto contacto);

    List<Contacto> getContactosDeUnComercial(Comercial comercial);

    Collection<Comercial> getTodosLosComerciales();

    Collection<Contacto> getTodosLosContactos();

    Long insertarComercial(Comercial c);

    Long insertarContacto(Contacto c);
}
