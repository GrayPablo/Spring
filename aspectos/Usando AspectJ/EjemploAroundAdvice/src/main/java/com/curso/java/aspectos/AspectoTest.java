/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.aspectos;

import java.util.Arrays;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author jose maria
 */
@Aspect
@Component
public class AspectoTest {

    @Around("execution(public * *(..))")
    public Object advice(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("**********************************");
        System.out.format("La clase del método que se sa a ejecutar es: %s\n", jp.getSignature().getDeclaringTypeName());
        System.out.format("Ejecutando: %s\n", jp.getSignature().getName());
        final Optional<Object> resultado;
        Object[] args = jp.getArgs();
        if (args.length == 0) {
            System.out.println("El método que se va a ejecutar no tiene parámetros");
            resultado = Optional.ofNullable(jp.proceed());
        } else {
            Object[] toArray = Arrays.asList(args).stream().map(x -> x += "Cambiado").collect(toList()).toArray();
            resultado = Optional.ofNullable(jp.proceed(toArray));
        }
        System.out.println("La clase del objeto devuelto por proceed es "
                + resultado.map(x -> x.getClass().getName()).orElse("No hay resultado"));
        System.out.format("Después de ejecutar: %s\n", jp.getSignature().getName());
        System.out.println("**********************************");
        return resultado.orElse("NULL");
    }
}
