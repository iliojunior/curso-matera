package com.ilio.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class AllTests {
	
	@Test
	public void tesouraContraPapel(){
		
		final Jogador jogadorPedra= new Jogador(Enumerador.PEDRA);
		final Jogador jogadorTesoura= new Jogador(Enumerador.TESOURA);
		final Jogada jogada = new Jogada(jog1, jog2);
		
		assertEquals(jogada.validar(), jogadorTesoura);
	}

}
