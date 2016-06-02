package aspectos;

import beans.Autenticador;
import beans.Mensajero;;

public aspect AspectoSeguridad {
	private Autenticador autenticador = new Autenticador();

	pointcut accesoSeguro() : execution(* Mensajero.entregar(..));

	before() : accesoSeguro() {
		autenticador.autenticar();
	}
}
