/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author jose maria
 */
@Aspect
@Component
public class AspectoTest {

    @Before("execution(public * *(..))")
    public void advice(JoinPoint jp) {
        System.out.println("En advice Before: " + jp.getSignature().getName());
        
    }
}
