package com.dudacf26.core.tema11;

public class Main {
	public static void main(String[] args) {
		Pizza calabresa = PizzaFactory.criaPizza("Calabresa");
		calabresa.exibirInfo();
		Pizza portuguesa = PizzaFactory.criaPizza("Portuguesa");
		portuguesa.exibirInfo();
		Pizza frango = PizzaFactory.criaPizza("Frango");
		frango.exibirInfo();
	}
}
