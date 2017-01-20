package com.materasystems.curso.ferias.classes.objetos;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by eso on 18/01/17.
 */
public class LampadaTest {

	@Test
	public void acendeLampada() {
		Lampada lampada = new Lampada();
		Assert.assertFalse(lampada.getLigada());

		lampada.ligar();
		Assert.assertTrue(lampada.getLigada());
	}

	@Test
	public void apagaLampada() {

		Lampada lampada = new Lampada();
		lampada.ligar();

		lampada.desligar();
		Assert.assertFalse(lampada.getLigada());

	}

}
