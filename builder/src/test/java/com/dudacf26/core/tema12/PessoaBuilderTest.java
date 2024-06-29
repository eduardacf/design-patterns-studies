package com.dudacf26.core.tema12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PessoaBuilderTest {
    @Test
    public void testaSeCriaPessoa() {
        Pessoa pessoa = PessoaBuilder.builder()
                                     .adicionarDataNascimento("26/01/1998")
                                     .adicionarNome("Eduarda")
                                     .adicionarEndereco("Martinica", 54, "Viamão", "Rio Grande do Sul")
                                     .criarPessoa();

        assertEquals("Eduarda", pessoa.getNome());
        assertEquals("26/01/1998", pessoa.getDataDeNascimento());
        assertEquals("Martinica", pessoa.getEndereco().getRua());
        assertEquals(54, pessoa.getEndereco().getNumero());
        assertEquals("Viamão", pessoa.getEndereco().getCidade());
        assertEquals("Rio Grande do Sul", pessoa.getEndereco().getEstado());
    }
}
