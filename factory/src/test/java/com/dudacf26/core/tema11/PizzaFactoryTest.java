package com.dudacf26.core.tema11;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PizzaFactoryTest {
	@Test
	public void testarSeCriaPizzaCalabresa() {
        assertTrue(PizzaFactory.criaPizza("Calabresa") instanceof Calabresa);
	}
	@Test
	public void testarSeCriaPizzaFrango() {
        assertTrue(PizzaFactory.criaPizza("Frango") instanceof Frango);
	}
	@Test
	public void testarSeCriaPizzaPortuguesa() {
        assertTrue(PizzaFactory.criaPizza("Portuguesa") instanceof Portuguesa);
	}
}
