package com.dudacf26.core.tema16;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BancoTest {
    private Banco banco;

    @Before
    public void init() {
        banco = new Banco();
    }

    @Test
    public void testarSaque() {
        Saque saque = new Saque(200);
        banco.receberOperacao(saque);
        int saldo = banco.consultarSaldo();
        assertEquals(-200, saldo);
    }

    @Test
    public void testarDeposito() {
        Deposito deposito = new Deposito(1000);
        banco.receberOperacao(deposito);
        int saldo = banco.consultarSaldo();
        assertEquals(1000, saldo);
    }

    @Test
    public void testarDepositoeSaque() {
        Deposito deposito = new Deposito(2000);
        Saque saque = new Saque(450);
        banco.receberOperacao(deposito);
        banco.receberOperacao(saque);
        int saldo = banco.consultarSaldo();
        assertEquals(1550, saldo);
    }
}
