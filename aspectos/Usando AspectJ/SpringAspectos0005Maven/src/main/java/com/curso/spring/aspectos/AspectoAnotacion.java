/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.aspectos;

import com.curso.spring.anotaciones.Curso;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrador
 */
@Aspect
@Component
public class AspectoAnotacion {

    @Before("@annotation(curso) && args(cualquiera)")
    public void m(JoinPoint p, Curso curso, String cualquiera) {
        System.out.format("Before:Se ha ejecutado el método %s con el parámetro %s.%n", p.getSignature().getName(), cualquiera);
    }
}
