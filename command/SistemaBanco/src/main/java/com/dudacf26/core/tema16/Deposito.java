package com.dudacf26.core.tema16;

public class Deposito implements Operacao {
	private int valor;

	public Deposito(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int executar() {
		return this.valor;
	}
}
