package com.dudacf26.core.tema14;

public abstract class BebidaQuente {

	public abstract String prepararBebida();

	public abstract String servirBebida();

	public final String entregarBebida() {
		return ("Sua bebida está pronta para ser retirada :D");
	}

	public final void vendeBebida() {
		prepararBebida();
		servirBebida();
		entregarBebida();
	}

}
