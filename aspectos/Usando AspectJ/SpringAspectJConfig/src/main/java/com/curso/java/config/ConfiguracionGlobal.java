/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author jose maria
 */
@Configuration
@ComponentScan(basePackages="com.curso.java")
@EnableAspectJAutoProxy
public class ConfiguracionGlobal {
    
}
