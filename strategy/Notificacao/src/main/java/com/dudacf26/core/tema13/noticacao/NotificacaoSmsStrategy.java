package com.dudacf26.core.tema13.noticacao;

public class NotificacaoSmsStrategy implements NotificacaoStrategy {
	@Override
	public String notificar(String mensagem) {
		return mensagem + "SMS";
	}
}
