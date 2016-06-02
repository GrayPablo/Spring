package com.curso.spring.springaspectos0001.sistema;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.curso.spring.springaspectos0001.basico.ServicioSaludo;
import com.curso.spring.springaspectos0001.dominio.Persona;
import com.curso.spring.springaspectos0001.introducciones.EjemploIntroduccion;

public class Principal {

    private ClassPathXmlApplicationContext ctx;
    private Log log = LogFactory.getLog(Principal.class);
    private ServicioSaludo ss;

    public Principal() {
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.inicializarSpring();
        p.forzarEjecucionAspectoAfter();
        p.forzarEjecucionAspectoAfterReturning();
        try {
            p.forzarEjecucionAspectoAfterThrowing();
        } catch (Exception e) {
            System.out.println("Capturada una excepción de tipo " + e.getClass().getName());
        }
        p.forzarEjecucionAspectoBefore();
        p.forzarEjecucionAspectoBeforeConParametro();
        p.forzarEjecucionAspectoAround();
        p.forzarEjecucionAspectoIntroduccion();
    }

    private void inicializarSpring() {
        String[] contextos = {"recursos/aspectosContext.xml", "recursos/introduccionContext.xml"};
        ctx = new ClassPathXmlApplicationContext(contextos);
        ss = (ServicioSaludo) ctx.getBean("servicioSaludo");
        log.info("Spring se ha inicializado correctamente");
    }

    private void forzarEjecucionAspectoAfterReturning() {
        ss.principalAfterReturning();
    }

    private void forzarEjecucionAspectoBefore() {
        ss.principalBefore();
    }

    private void forzarEjecucionAspectoAfter() {
        ss.principalAfter();
    }

    private void forzarEjecucionAspectoAfterThrowing() {
        ss.metodoPublicoCualquiera();
    }

    private void forzarEjecucionAspectoAround() {
        ss.metodoLento();
    }

    private void forzarEjecucionAspectoBeforeConParametro() {
        ss.principalBefore(7);
    }

    private void forzarEjecucionAspectoIntroduccion() {
        Persona persona = (Persona) ctx.getBean("persona");
        persona.setNombre("Un nombre");
        EjemploIntroduccion ej = (EjemploIntroduccion) ctx.getBean("persona");
        ej.mensaje();
    }
}