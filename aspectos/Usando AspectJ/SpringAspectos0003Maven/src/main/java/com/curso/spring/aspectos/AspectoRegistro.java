package com.curso.spring.aspectos;

import com.curso.spring.anotaciones.Registrable;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/*
 * AspectoRegistro.java
 *
 * Created on 26 de junio de 2007, 13:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
@Aspect
public class AspectoRegistro {

    @After("@annotation(registrable) && args(..,importe)")
    public void ejecutarAspectoError(Registrable registrable, Double importe) {
        System.out.println("Operación registrada por un importe de " + importe + " euros.");
        if (registrable.siHayError()) {
            System.out.println("Esta operación debe registrarse en otro sitio en caso de que falle");
        }
    }
}
