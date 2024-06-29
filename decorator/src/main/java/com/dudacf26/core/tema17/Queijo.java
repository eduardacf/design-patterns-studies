package com.dudacf26.core.tema17;

public class Queijo extends PizzaDecorator {

    public Queijo(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double obterPreco() {
        double queijo = 3.00;
        return super.obterPreco() + queijo;
	}
}
