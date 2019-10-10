package com.dudacf26.core.tema13;

import java.util.Optional;

public class Cliente {

	private String nome;
	private String email;
	private Optional<String> telefone;

	public Cliente(String nome, String email, Optional<String> telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Optional<String> getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}
}
