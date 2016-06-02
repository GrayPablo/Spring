/*
 * Contacto.java
 *
 * Created on 5 de junio de 2007, 12:04
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.springdaojpa.beans.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity class Contacto
 * 
 * @author user
 */
@Entity
public class Contacto implements Serializable {

    @ManyToOne
    private Comercial comercial;
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

    /** Creates a new instance of Contacto */
    public Contacto() {
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the id of this Contacto.
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets the id of this Contacto to the specified value.
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns a hash code value for the object.  This implementation computes 
     * a hash code value based on the id fields in this object.
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    /**
     * Determines whether another object is equal to this Contacto.  The result is 
     * <code>true</code> if and only if the argument is not null and is a Contacto object that 
     * has the same id field values as this object.
     * @param object the reference object with which to compare
     * @return <code>true</code> if this object is the same as the argument;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if (this.getId() != other.getId() && (this.getId() == null || !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object.  This implementation constructs 
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "beans.entidad.Contacto[id=" + getId() + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Comercial getComercial() {
        return comercial;
    }

    public void setComercial(Comercial comercial) {
        this.comercial = comercial;
    }
}
