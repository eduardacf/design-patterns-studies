package com.dudacf26.core.tema13;

import static org.junit.Assert.assertEquals;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class GerenciarNotificacaoTest {

	@Test
	public void enviaMensagemEmail() {
		NotificacaoValida notificacaoValida = new NotificacaoValida();
		Cliente cliente = new Cliente("Logan", "eduarda.ferreira@gmail.com", Optional.empty());
		GerenciadorNotificacao mensagem = new GerenciadorNotificacao(notificacaoValida.validar(cliente));
		assertEquals("Hello Logan Email", mensagem.enviar(cliente));
	}

	@Test
	public void enviaMensagemTelefone() {
		NotificacaoValida notificacaoValida = new NotificacaoValida();
		Cliente cliente = new Cliente("Eduarda", "eduarda.ferreira@gmail.com", Optional.of("8676-7567"));
		GerenciadorNotificacao mensagem = new GerenciadorNotificacao(notificacaoValida.validar(cliente));
		assertEquals("Hello Eduarda SMS", mensagem.enviar(cliente));
	}
}
