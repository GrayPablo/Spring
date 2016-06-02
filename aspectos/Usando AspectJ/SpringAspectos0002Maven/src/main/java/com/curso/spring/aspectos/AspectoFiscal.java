/*
 * AspectoFiscal.java
 *
 * Created on 26 de junio de 2007, 13:36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.curso.spring.aspectos;

import com.curso.spring.anotaciones.Fiscalizable;
import com.curso.spring.dominio.Cliente;
import com.curso.spring.dominio.Cuenta;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author Administrador
 */
@Aspect
public class AspectoFiscal {

    @Before("@annotation(fiscalizable) && args(cliente,cuenta,importe)")
    public void ejecutarAspectoError(Fiscalizable fiscalizable, Cliente cliente, Cuenta cuenta, Double importe) {
        System.out.println("Operacion registrada por un importe de " + importe + " euros.");
        if (importe > fiscalizable.importe()) {
            System.out.println("Esta operación requiere avisar a Hacienda, ya que su importe (" + importe + ") euros, es mayor que el límite legal de " + fiscalizable.importe());
        }
    }
}
