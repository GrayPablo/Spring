/*
 * ServicioClienteImpl.java
 *
 * Created on 26 de junio de 2007, 12:58
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.spring.servicio;

import com.curso.spring.anotaciones.Fiscalizable;
import com.curso.spring.anotaciones.Registrable;
import com.curso.spring.dominio.Cliente;
import com.curso.spring.dominio.Cuenta;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrador
 */
@Repository
@Transactional(readOnly = true)
public class ServicioClienteImpl implements ServicioCliente {

    @PersistenceContext()
    private EntityManager em;

    /**
     * Creates a new instance of ServicioClienteImpl
     */
    public ServicioClienteImpl() {
    }

    public Cliente getCliente(Long clienteId) {
        return null;
    }

    @Registrable
    @Fiscalizable
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void ingresar(Cliente cliente, Cuenta cuenta, Double importe) {
        cuenta.setSaldo(importe);
        cliente.getCuentas().add(cuenta);
        cuenta.setCliente(cliente);
        em.persist(cliente);
    }

    @Registrable(siHayError = true)
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public Double reintegrar(Cliente cliente, Cuenta cuenta, Double importe) {
        return null;
    }

    public Double getSaldoMedio(Cliente cliente) {
        return null;
    }
}
