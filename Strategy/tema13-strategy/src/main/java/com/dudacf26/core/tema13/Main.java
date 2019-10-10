package com.dudacf26.core.tema13;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {

		NotificacaoValida notificacaoValida = new NotificacaoValida();
		
		Cliente cliente1 = new Cliente("Eduarda", "eduarda.ferreira@gmail.com", Optional.of("99639-2987"));
		GerenciadorNotificacao mensagem1 = new GerenciadorNotificacao(notificacaoValida.validar(cliente1));
		System.out.println(mensagem1.enviar(cliente1));
		
		Cliente cliente2 = new Cliente("Logan", "logan.araujo@gmail.com", Optional.empty());
		GerenciadorNotificacao mensagem2 = new GerenciadorNotificacao(notificacaoValida.validar(cliente2));
		System.out.println(mensagem2.enviar(cliente2));
	}
}
