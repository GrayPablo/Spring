/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author jose maria
 */
@Aspect
public class TestAspectJAnotaciones {

    @Pointcut("call(* get*(..))")
    public void test() {
    }

    @Before("test()")
    public void printTest(JoinPoint p) {
        System.out.println("Se va a ejecutar un método get: " + p);
    }
}
