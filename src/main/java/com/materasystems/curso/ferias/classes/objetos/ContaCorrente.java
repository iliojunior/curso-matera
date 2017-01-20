package com.materasystems.curso.ferias.classes.objetos;

public class ContaCorrente {

	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;
	private double saldoLimite;

	public int getNumero() {
		return numero;
	}

	public void setNumero(final int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(final double saldo) {
		this.saldo = saldo;
	}

	public boolean getEspecial() {
		return especial;
	}

	public void setEspecial(final boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(final double limite) {
		this.limite = limite;
	}

	public double getSaldoLimite() {
		return saldoLimite;
	}

	public void setSaldoLimite(final double saldoLimite) {
		this.saldoLimite = saldoLimite;
	}

	public double consultaSaldo() {
		return (getSaldo() + getLimite()) - getSaldoLimite();

	}

	public int realizaDeposito(double valor) {
		if (valor > 0) {
			if (getSaldoLimite() > 0) {
				if (valor > getSaldoLimite()) {
					valor -= getSaldoLimite();
					setSaldoLimite(0);
				} else
					setSaldoLimite(getSaldoLimite() + valor);
			}
			if (valor > 0) {
				setSaldo(getSaldo() + valor);
			}
			return 0;
		}
		return -1;
	}

	public int realizaSaque(double valor) {
		if (valor > 0) {
			if (valor <= consultaSaldo()) {
				if (valor <= getSaldo()) {
					setSaldo(getSaldo() - valor);
					return 0;
				} else if (getEspecial()) {
					setSaldoLimite(valor - getSaldo());
					setSaldo(0);
					return 0;
				}
			}
			return -2;
		}
		return -1;
	}

	public boolean usandoLimite() {
		return (getSaldoLimite() > 0 && getEspecial());
	}
}
