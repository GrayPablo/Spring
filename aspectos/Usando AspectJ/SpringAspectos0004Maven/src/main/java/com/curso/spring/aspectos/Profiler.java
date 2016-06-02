/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.spring.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

/**
 *
 * @author Administrador
 */
@Aspect
public class Profiler {

    @Around("execution(* set*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch sw = new StopWatch(getClass().getSimpleName());
        try {
            sw.start(pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            sw.stop();
            System.out.println(sw.prettyPrint());
        }
    }
}
