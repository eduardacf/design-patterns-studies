package com.dudacf26.core.tema16;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		Saque saque = new Saque(200);
		Deposito deposito = new Deposito(500);

		banco.receberOperacao(saque);
		banco.receberOperacao(deposito);

		int saldo = banco.consultarSaldo();

		System.out.println("Seu saldo é:" + saldo);
	}
}
