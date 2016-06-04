/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.servicios;

import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose maria
 */
@Service
public class TestServicio {
    public void daIgual(){
        System.out.println("Llamada al método del servicio");
    }
    public Date laFecha(String texto){
        Date d = new Date();
        System.out.println(texto + d);
        return d;
    }
}
