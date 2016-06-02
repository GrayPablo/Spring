/*
 * Fiscalizable.java
 *
 * Created on 25 de junio de 2007, 14:57
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.spring.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Administrador
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Fiscalizable {

    double importe() default 3000.0d;
}
