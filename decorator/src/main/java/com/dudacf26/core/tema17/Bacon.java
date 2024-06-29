package com.dudacf26.core.tema17;

public class Bacon extends PizzaDecorator {

    public Bacon(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double obterPreco() {
        double bacon = 3.50;
        return super.obterPreco() + bacon;
	}
}
