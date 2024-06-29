package com.dudacf26.core.tema13;

import com.dudacf26.core.tema13.noticacao.NotificacaoEmailStrategy;
import com.dudacf26.core.tema13.noticacao.NotificacaoSmsStrategy;
import com.dudacf26.core.tema13.noticacao.NotificacaoStrategy;

public class NotificacaoValida {
	
	public NotificacaoStrategy validar(Cliente cliente) {		
		if (cliente.getTelefone().isPresent()) {
			return new NotificacaoSmsStrategy();
		} else {
			return new NotificacaoEmailStrategy();
		}
	}

}
