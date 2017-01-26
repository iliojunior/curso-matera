package test;

import main.ListaEncadeada;
import main.No;
import org.junit.Assert;
import org.junit.Test;

public class TestLista {
    @Test
    public void test01() {
        final ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.adicionar("ilio0");
        listaEncadeada.adicionar("ilio1");
        listaEncadeada.adicionar("ilio2");
        listaEncadeada.adicionar("ilio3");
        listaEncadeada.adicionar("ilio4");
        listaEncadeada.adicionar("ilio5");

        Assert.assertTrue(listaEncadeada.remover(2));
        Assert.assertTrue(listaEncadeada.remover(0));
        Assert.assertTrue(listaEncadeada.remover(5));

        listaEncadeada.imprimir();

        Assert.assertTrue(listaEncadeada.contem("ilio3"));
        Assert.assertFalse(listaEncadeada.contem("ilio2"));
        Assert.assertEquals(listaEncadeada.size(), 4);
    }

    @Test
    public void testNulo() {
        final ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.imprimir();
        listaEncadeada.remover(0);

        Assert.assertFalse(listaEncadeada.contem(null));
        Assert.assertEquals(listaEncadeada.size(), 0);
    }

    @Test
    public void testGet() {
        final ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.adicionar("ilio0");
        listaEncadeada.adicionar("ilio1");
        listaEncadeada.adicionar("ilio2");
        listaEncadeada.adicionar("ilio3");
        listaEncadeada.adicionar("ilio4");
        listaEncadeada.adicionar("ilio5");

        final No elemento = listaEncadeada.get(2);
        Assert.assertTrue(elemento.getElemento().getNome().equals("ilio2"));
    }
}
