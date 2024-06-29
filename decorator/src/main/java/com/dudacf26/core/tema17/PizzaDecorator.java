package com.dudacf26.core.tema17;

public class PizzaDecorator implements Pizza {
	
	private final Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	@Override
	public double obterPreco() {
		return pizza.obterPreco();
	}

}
