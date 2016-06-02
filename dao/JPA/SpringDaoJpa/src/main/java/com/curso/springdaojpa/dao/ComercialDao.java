/*
 * ComercialDao.java
 *
 * Created on 6 de junio de 2007, 11:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.springdaojpa.dao;

import com.curso.springdaojpa.beans.entidad.Comercial;
import com.curso.springdaojpa.beans.entidad.Contacto;
import java.util.Collection;

/**
 *
 * @author user
 */
public interface ComercialDao {

    Collection<Comercial> getTodosLosComerciales();

    Long insertarComercial(Comercial c);

    void asignarContacto(Comercial comercial, Contacto contacto);

    Comercial getComercial(Long id);
}
