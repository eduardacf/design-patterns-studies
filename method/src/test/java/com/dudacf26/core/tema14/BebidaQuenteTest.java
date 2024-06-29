package com.dudacf26.core.tema14;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BebidaQuenteTest {

    @Test
    public void testaServirCafe() {
        Cafe cafe = new Cafe();
        assertTrue(cafe.servirBebida().contains("Servindo o caf�!"));
    }

    @Test
    public void testaPrepararCafe() {
        Cafe cafe = new Cafe();
        assertTrue(cafe.prepararBebida().contains("Preparando o caf�!"));
    }

    @Test
    public void testaEntregaCafe() {
        Cafe cafe = new Cafe();
        assertTrue(cafe.entregarBebida().contains("Sua bebida est� pronta para ser retirada :D"));
    }

    @Test
    public void testaServirCha() {
        Cha cha = new Cha();
        assertTrue(cha.servirBebida().contains("Servindo o ch�!"));
    }

    @Test
    public void testaPrepararCha() {
        Cha cha = new Cha();
        assertTrue(cha.prepararBebida().contains("Preparando o ch�!"));
    }

    @Test
    public void testaEntregaCha() {
        Cha cha = new Cha();
        assertTrue(cha.entregarBebida().contains("Sua bebida est� pronta para ser retirada :D"));
    }
}
