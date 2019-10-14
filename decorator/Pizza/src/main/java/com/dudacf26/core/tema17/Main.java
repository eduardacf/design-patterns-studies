package com.dudacf26.core.tema17;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = new BasePizza();

		Pizza pizzaDoubleQueijo = new Bacon(new Queijo(new Queijo(pizza)));

		System.out.println(pizzaDoubleQueijo.obterPreco());
	}

}
