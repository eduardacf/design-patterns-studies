package com.dudacf26.core.tema13;

import com.dudacf26.core.tema13.noticacao.NotificacaoStrategy;
public class GerenciadorNotificacao {

	private NotificacaoStrategy notificacao;
	private Mensagem mensagem = new Mensagem();

	public GerenciadorNotificacao(NotificacaoStrategy notificacao) {
		this.notificacao = notificacao;
	}

	public String enviar(Cliente cliente) {
		return notificacao.notificar(mensagem.criaMensagem(cliente));
	}
}
