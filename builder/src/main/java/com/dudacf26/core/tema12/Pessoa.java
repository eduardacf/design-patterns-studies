package com.dudacf26.core.tema12;

public class Pessoa {
	public String nome;
	public String dataDeNascimento;
	public Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa \n" + "Nome:" + nome + "Data de Nascimento:" + dataDeNascimento + "Endereço" + endereco + ":D";
	}
}
