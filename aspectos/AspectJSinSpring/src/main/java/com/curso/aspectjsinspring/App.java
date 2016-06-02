package com.curso.aspectjsinspring;

import beans.Mensaje;
import beans.Mensajero;
import beans.Persona;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        mensaje.setTexto("abc");
        System.out.println("Texto del mensaje: " + mensaje.getTexto());
        Mensajero mensajero = new Mensajero();
        mensajero.entregar("Mensaje uno");
        mensajero.entregar("Una persona", "Mensaje dos");
        Persona persona = new Persona();
        System.out.println(persona);
    }
}
