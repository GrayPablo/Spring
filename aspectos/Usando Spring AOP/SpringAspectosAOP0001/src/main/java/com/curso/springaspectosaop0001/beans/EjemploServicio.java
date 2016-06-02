/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.springaspectosaop0001.beans;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose maria
 */
public class EjemploServicio implements Servicio {

    @Override
    public String obtenerMensaje() {
        return "mensaje";
    }

    @Override
    public Integer conParametro(Integer parametro) {
        return parametro + 1;
    }

    @Override
    public Long obtenerTiempo() {
        return System.currentTimeMillis();
    }

    @Override
    public void lanzarExcepcion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void metodoLento() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
