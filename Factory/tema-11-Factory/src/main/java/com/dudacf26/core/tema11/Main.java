package com.dudacf26.core.tema11;

public class Main {

	public static void main(String[] args) {
		PizzaFactory pizza = new PizzaFactory();
		
		Pizza calabresa = pizza.criaPizza("Calabresa");
		calabresa.exibirInfo();
		Pizza portuguesa = pizza.criaPizza("Portuguesa");
		portuguesa.exibirInfo();
		Pizza frango = pizza.criaPizza("Frango");
		frango.exibirInfo();

	}

}
