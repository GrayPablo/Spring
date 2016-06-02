/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.springaspectosaop0001.beans;

/**
 *
 * @author jose maria
 */
public interface Servicio {

    String obtenerMensaje();

    Integer conParametro(Integer parametro);

    Long obtenerTiempo();

    void lanzarExcepcion();

    void metodoLento();
}
