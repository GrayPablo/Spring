/*
 * CuentaImpl.java
 *
 * Created on 27-sep-2007, 12:04:27
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.dominio;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class CuentaImpl implements Serializable, Cuenta {

    public Cliente getCliente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double getSaldo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void ingresar(Double importe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double reintegrar(Double importe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}