/*
 * ServicioClienteImpl.java
 *
 * Created on 27-sep-2007, 12:05:48
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.servicios;

import com.curso.spring.anotaciones.Fiscalizable;
import com.curso.spring.anotaciones.Registrable;
import com.curso.spring.dominio.Cliente;
import com.curso.spring.dominio.Cuenta;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class ServicioClienteImpl implements Serializable, ServicioCliente {

    public Cliente getCliente(Long clienteId) {
        return null;
    }

    @Registrable
    @Fiscalizable
    public void ingresar(Cliente cliente, Cuenta cuenta, Double importe) {
    }

    @Registrable(siHayError = true)
    public Double reintegrar(Cliente cliente, Cuenta cuenta, Double importe) {
        return null;
    }

    public Double getSaldoMedio(Cliente cliente) {
        return null;
    }
}