package com.dudacf26.core.tema17;

public class Queijo extends PizzaDecorator {
	
	private final double QUEIJO = 3.00;

	public Queijo(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double obterPreco() {
		return super.obterPreco() + QUEIJO;
	}

}
