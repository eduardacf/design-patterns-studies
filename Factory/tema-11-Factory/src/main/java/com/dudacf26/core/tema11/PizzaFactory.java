package com.dudacf26.core.tema11;

public class PizzaFactory {

	public static Pizza criaPizza(String tipoDePizza) {
		switch (tipoDePizza) {
		case "Calabresa":
			return new Calabresa();
		case "Frango":
			return new Frango();
		case "Portuguesa":
			return new Portuguesa();
		default:
			throw new RuntimeException("Pizza inválida");
		}

	}

}
