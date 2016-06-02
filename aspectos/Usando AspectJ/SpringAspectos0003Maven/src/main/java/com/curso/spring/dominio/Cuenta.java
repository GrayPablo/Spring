/*
 * Cuenta.java
 *
 * Created on 26 de junio de 2007, 12:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.spring.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity class Cuenta
 *
 *
 * @author Administrador
 */
@Entity
public class Cuenta implements Serializable {

    @ManyToOne
    private Cliente cliente;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double saldo;

    /**
     * Creates a new instance of Cuenta
     */
    public Cuenta() {
    }

    /**
     * Gets the id of this Cuenta.
     *
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets the id of this Cuenta to the specified value.
     *
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns a hash code value for the object. This implementation computes a
     * hash code value based on the id fields in this object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    /**
     * Determines whether another object is equal to this Cuenta. The result is
     * <code>true</code> if and only if the argument is not null and is a Cuenta
     * object that has the same id field values as this object.
     *
     * @param object the reference object with which to compare
     * @return <code>true</code> if this object is the same as the argument;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if (this.getId() != other.getId() && (this.getId() == null || !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object. This implementation
     * constructs that representation based on the id fields.
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "dominio.CuentaImpl[id=" + getId() + "]";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
