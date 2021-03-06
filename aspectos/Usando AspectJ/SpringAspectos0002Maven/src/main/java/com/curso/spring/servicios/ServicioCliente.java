/*
 * ServicioCliente.java
 *
 * Created on 25 de junio de 2007, 14:25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.spring.servicios;

import com.curso.spring.anotaciones.Fiscalizable;
import com.curso.spring.anotaciones.Registrable;
import com.curso.spring.dominio.Cliente;
import com.curso.spring.dominio.Cuenta;

/**
 *
 * @author Administrador
 */
public interface ServicioCliente {

    Cliente getCliente(Long clienteId);

    @Registrable
    @Fiscalizable
    void ingresar(Cliente cliente, Cuenta cuenta, Double importe);

    @Registrable(siHayError = true)
    public Double reintegrar(Cliente cliente, Cuenta cuenta, Double importe);

    public Double getSaldoMedio(Cliente cliente);
}
