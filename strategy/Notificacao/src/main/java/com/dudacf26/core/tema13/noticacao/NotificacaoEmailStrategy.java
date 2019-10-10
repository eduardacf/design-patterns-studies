package com.dudacf26.core.tema13.noticacao;

public class NotificacaoEmailStrategy implements NotificacaoStrategy {
	@Override
	public String notificar(String mensagem) {
		return mensagem + "Email";
	}
}
