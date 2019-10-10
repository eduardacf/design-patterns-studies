package com.dudacf26.core.tema12;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PessoaBuilderTest {

	@Test
	public void testaSeCriaPessoa() {
		Pessoa pessoa = PessoaBuilder.builder().adicionarDataNascimento("26/01/1998").adicionarNome("Eduarda")
				.adicionarEndereco("Martinica", 54, "Viamão", "Rio Grande do Sul").criarPessoa();

		assertTrue(pessoa.getNome().equals("Eduarda"));
		assertTrue(pessoa.getDataDeNascimento().equals("26/01/1998"));
		assertTrue(pessoa.getEndereco().getRua().equals("Martinica"));
		assertTrue(pessoa.getEndereco().getNumero() == 54);
		assertTrue(pessoa.getEndereco().getCidade().equals("Viamão"));
		assertTrue(pessoa.getEndereco().getEstado().equals("Rio Grande do Sul"));
	}
}
