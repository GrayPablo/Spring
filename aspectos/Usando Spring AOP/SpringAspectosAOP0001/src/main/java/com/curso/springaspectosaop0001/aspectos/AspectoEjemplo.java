/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.springaspectosaop0001.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author jose maria
 */
public class AspectoEjemplo {

    public void testBeforeSinParametros() {
        System.out.println("Mensaje desde AspectoEjemplo. Test de un advice before sin parámetros");
    }

    public void testBeforeConParametros(Integer parametro) {
        System.out.println("Mensaje desde AspectoEjemplo. Test de un advice before con parámetros. El valor del parámetro es " + parametro);
    }

    public void testAfterSinParametros(JoinPoint jp) {
        System.out.println("Mensaje desde AspectoEjemplo. Test de un advice after sin parámetros. Se ha ejecutado " + jp.getSignature());
    }

    public void testAfterReturning(String valor) {
        System.out.println("Mensaje desde AspectoEjemplo. Test de un advice AfterReturning. El valor devuelto es " + valor);
    }

    public void testAfterThrowing(Exception e) {
        System.out.println("Mensaje desde AspectoEjemplo. Test de un advice AfterThrowing. Ha ocurrido un error del tipo " + e.getClass());
    }

    public Object testAround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Mensaje desde AspectoEjemplo.Test de un advice Around.");
        long comienzo = System.nanoTime();
        Object ret = jp.proceed();
        long fin = System.nanoTime();
        System.out.println(jp.getSignature() + " ha tardado "
                + (fin - comienzo) + " nanosegundos");
        return ret;
    }
}
