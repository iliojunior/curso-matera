package com.ilio.test;

import com.ilio.Enumerador;

public class Jogador {
	
	private final Enumerador.TipoJogada tipoJogada;
	
	public Jogador(final Enumerador.TipoJogada tipoJogada){
		this.tipoJogada = tipoJogada;
	}

	public Enumerador.TipoJogada getTipoJogada(){
		return tipoJogada;
	}	
}
