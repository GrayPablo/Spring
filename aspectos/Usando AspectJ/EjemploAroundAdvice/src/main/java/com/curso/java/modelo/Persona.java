/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.modelo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Chema
 */
@Component
@Scope("prototype")
public class Persona {

    public Persona() {
        System.out.println("En el constructor de persona");
    }
    
}
