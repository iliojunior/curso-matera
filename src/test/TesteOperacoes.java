package test;

import Enumerador.Operacoes;
import org.junit.Assert;
import org.junit.Test;

public class TesteOperacoes {
    @Test
    public void testOperacoes(){
        final Operacoes resultado = Operacoes.getValue("Multiplicacao");
        Assert.assertEquals(resultado, Operacoes.VEZES);
    }
}
