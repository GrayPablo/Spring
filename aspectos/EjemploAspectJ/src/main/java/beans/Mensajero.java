/**
 *
 */
package beans;

/**
 * @author jose maria
 *
 */
public class Mensajero {

    public void entregar(String mensaje) {
        System.out.println(mensaje);
    }

    public void entregar(String persona, String mensaje) {
        System.out.println(persona + ", " + mensaje);
    }
}
