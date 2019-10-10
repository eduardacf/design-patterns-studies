package com.dudacf26.core.tema12;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = PessoaBuilder.builder()
				.adicionarDataNascimento("26/01/1998")
				.adicionarNome("Eduarda")
				.adicionarEndereco("Martinica", 54, "Viamão", "Rio Grande do Sul")
				.criarPessoa();
		System.out.println(pessoa);
	}
}
