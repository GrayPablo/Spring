/*
 * Comercial.java
 *
 * Created on 6 de junio de 2007, 11:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.springdaojpa.beans.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity class Comercial
 * 
 * @author user
 */
@Entity
public class Comercial implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "comercial", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Contacto> contactos;

    /** Creates a new instance of Comercial */
    public Comercial() {
    }

    public Comercial(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the id of this Comercial.
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets the id of this Comercial to the specified value.
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
     * Determines whether another object is equal to this Comercial.  The result is 
     * <code>true</code> if and only if the argument is not null and is a Comercial object that 
     * has the same id field values as this object.
     * @param object the reference object with which to compare
     * @return <code>true</code> if this object is the same as the argument;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comercial)) {
            return false;
        }
        Comercial other = (Comercial) object;
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
        return "beans.entidad.Comercial[id=" + getId() + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contacto> getContactos() {
        if (contactos == null) {
            contactos = new ArrayList<Contacto>();
        }
        return contactos;
    }

    public void setContacto(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
