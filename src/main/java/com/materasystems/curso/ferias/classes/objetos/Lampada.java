package com.materasystems.curso.ferias.classes.objetos;

public class Lampada {

	private boolean ligada;

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean getLigada() {
		return ligada;
	}

	public void ligar() {
		setLigada(true);
	}

	public void desligar() {
		setLigada(false);
	}
}
