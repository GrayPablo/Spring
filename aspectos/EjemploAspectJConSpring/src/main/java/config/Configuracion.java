/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import beans.Persona;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author usuario
 */
@Configuration
@ComponentScan(basePackageClasses = beans.Persona.class)
public class Configuracion {
    public Persona nuevaPersona(){
        return new Persona();
    }
}
