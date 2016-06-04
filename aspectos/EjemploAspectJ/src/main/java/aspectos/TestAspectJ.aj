package aspectos;

public aspect TestAspectJ {
    pointcut ejecucionset() : call(* set*(..));
    after() : ejecucionset() {
        System.out.println("se ha ejecutado un método set: " + thisJoinPoint);
    }
}
