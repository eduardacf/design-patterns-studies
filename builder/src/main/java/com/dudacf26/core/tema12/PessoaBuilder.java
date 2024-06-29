package com.dudacf26.core.tema12;

public class PessoaBuilder {

	private final Pessoa pessoa;

	public PessoaBuilder() {
		this.pessoa = new Pessoa();
	}

	public static PessoaBuilder builder() {
		return new PessoaBuilder();
	}

	public PessoaBuilder adicionarDataNascimento(String dataDeNascimento) {
		this.pessoa.setDataDeNascimento(dataDeNascimento);
		return this;
	}

	public PessoaBuilder adicionarNome(String nome) {
		this.pessoa.setNome(nome);
		return this;
	}

	public PessoaBuilder adicionarEndereco(String rua, int numero, String cidade, String estado) {
		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		endereco.setNumero(numero);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		this.pessoa.setEndereco(endereco);
		return this;
	}

	public Pessoa criarPessoa() {
		return this.pessoa;
	}

}
