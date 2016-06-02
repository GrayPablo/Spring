/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aspectos;

/**
 *
 * @author jose maria
 */
public aspect TestAspectJ {
    pointcut ejecucionset() : call(* set*(..));
    after() : ejecucionset() {
        System.out.println("se ha ejecutado un método set: " + thisJoinPoint);
    }
}
