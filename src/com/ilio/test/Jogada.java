package com.ilio.test;

import java.util.Arrays;

import com.ilio.Enumerador.RetornoJogada;
import com.ilio.Enumerador.TipoJogada;

public class Jogada {

	private final Jogador jogador1;
	private final Jogador jogador2;

	public Jogada(final Jogador jogador1, final Jogador jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}

	private static int[] empates = new int[] { 0, 2, 10 };
	
	

	public RetornoJogada valida() {
		final int somaTipos = jogador1.getTipoJogada().getValue()
				+ jogador2.getTipoJogada().getValue();
		
		if(Arrays.asList(empates).contains(somaTipos))
			return RetornoJogada.EMPATE;
		
		if(somaTipos == 5)
			return RetornoJogada.TESOURA;
		
	}
}
