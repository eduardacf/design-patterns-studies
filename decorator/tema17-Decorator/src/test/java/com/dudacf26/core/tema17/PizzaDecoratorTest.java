package com.dudacf26.core.tema17;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class PizzaDecoratorTest {
	private Pizza pizza;

	@Before
	public void initialize() {
		pizza = new BasePizza();
	}

	@Test
	public void testPizzaBaconDobroDeQueijo() {
		Pizza pizzaBaconQueijo = new Bacon(new Queijo(new Queijo(pizza)));
		assertEquals(29.5, pizzaBaconQueijo.obterPreco(), 0.0);
	}

	@Test
	public void testPizzaBacon() {
		Pizza pizzaBacon = new Bacon(pizza);
		assertEquals(23.5, pizzaBacon.obterPreco(), 0.0);
	}

	@Test
	public void testPizzaQueijo() {
		Pizza pizzaQueijo = new Queijo(pizza);
		assertEquals(23.0, pizzaQueijo.obterPreco(), 0.0);
	}

	@Test
	public void testPizzaBase() {
		assertEquals(20.0, pizza.obterPreco(), 0.0);
	}

}
