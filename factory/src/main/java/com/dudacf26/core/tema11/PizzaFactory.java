package com.dudacf26.core.tema11;

public class PizzaFactory {
	public static Pizza criaPizza(String tipoDePizza) {
        return switch (tipoDePizza) {
            case "Calabresa" -> new Calabresa();
            case "Frango" -> new Frango();
            case "Portuguesa" -> new Portuguesa();
            default -> throw new RuntimeException("Pizza inválida");
        };
	}
}
