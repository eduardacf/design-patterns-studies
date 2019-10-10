package com.dudacf26.core.tema17;

public class Bacon extends PizzaDecorator {

	private final double BACON = 3.50;

	public Bacon(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double obterPreco() {
		return super.obterPreco() + BACON;
	}

}
