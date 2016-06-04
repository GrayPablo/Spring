package aspectos;

public aspect AspectoProfile {
	pointcut operacionPublica() : execution(public * *.*(..));

	Object around() : operacionPublica() {
		long comienzo = System.nanoTime();
		Object ret = proceed();
		long fin = System.nanoTime();
		System.out.println(thisJoinPointStaticPart.getSignature() + " ha tardado "
				+ (fin - comienzo) + " nanosegundos");
		return ret;
	}
}
