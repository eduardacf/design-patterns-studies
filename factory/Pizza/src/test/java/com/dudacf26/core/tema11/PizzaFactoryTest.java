package com.dudacf26.core.tema11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PizzaFactoryTest {
	@Test
	public void testarSeCriaPizzaCalabresa() {
		PizzaFactory pizza = new PizzaFactory();
		assertEquals(true, PizzaFactory.criaPizza("Calabresa") instanceof Calabresa);
	}
	@Test
	public void testarSeCriaPizzaFrango() {
		PizzaFactory pizza = new PizzaFactory();
		assertEquals(true, PizzaFactory.criaPizza("Frango") instanceof Frango);
	}
	@Test
	public void testarSeCriaPizzaPortuguesa() {
		PizzaFactory pizza = new PizzaFactory();
		assertEquals(true, PizzaFactory.criaPizza("Portuguesa") instanceof Portuguesa);
	}

}
