package com.dudacf26.core.tema16;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int saldo;
	private List<Operacao> operacoes = new ArrayList<Operacao>();


	public void receberOperacao(Operacao solicitacao) {
		operacoes.add(solicitacao);
	}

	public int consultarSaldo() {
		for (Operacao operacao : operacoes) {
			saldo += operacao.executar();
		}
		return saldo;

	}
}
