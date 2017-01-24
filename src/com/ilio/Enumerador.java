package com.ilio;

public class Enumerador {
	public enum TipoJogada {
		PEDRA(0), PAPEL(1), TESOURA(5);

		private final int cod;

		public int getValue(){
			return cod;
		}
		
		TipoJogada(final int cod) {
			this.cod = cod;
		}
	}

	public enum RetornoJogada {
		PEDRA(0), PAPEL(1), TESOURA(2), EMPATE(3);

		private final int cod;

		RetornoJogada(final int cod) {
			this.cod = cod;
		}
		
		public RetornoJogada convertJogadaInRetorno(final TipoJogada jogada){
			return EMPATE;
		}
	}

}
