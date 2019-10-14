package com.dudacf26.core.tema14;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class BebidaQuenteTest {

	@Test
	public void testaServirCafe() {
		Cafe cafe = new Cafe();
		assertTrue(cafe.servirBebida().contains("Servindo o café!"));
	}

	@Test
	public void testaPrepararCafe() {
		Cafe cafe = new Cafe();
		assertTrue(cafe.prepararBebida().contains("Preparando o café!"));
	}

	@Test
	public void testaEntregaCafe() {
		Cafe cafe = new Cafe();
		assertTrue(cafe.entregarBebida().contains("Sua bebida está pronta para ser retirada :D"));
	}

	@Test
	public void testaServirCha() {
		Cha cha = new Cha();
		assertTrue(cha.servirBebida().contains("Servindo o chá!"));
	}

	@Test
	public void testaPrepararCha() {
		Cha cha = new Cha();
		assertTrue(cha.prepararBebida().contains("Preparando o chá!"));
	}

	@Test
	public void testaEntregaCha() {
		Cha cha = new Cha();
		assertTrue(cha.entregarBebida().contains("Sua bebida está pronta para ser retirada :D"));
	}

}
