/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.loop;

import java.util.Arrays;

/**
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
public class While {

	/**
	 * Filtra todos elementos ímpares.
	 * 
	 * @param elementos
	 * @return
	 */
	public int[] getImpares(int[] elementos) {
		final int[] saida = new int[elementos.length];
		int count = 0;
		int i = 0;
		while (i < elementos.length) {
			if (elementos[i] % 2 != 0) {
				saida[count] = elementos[i];
				count++;
			}
			i++;
		}

		return Arrays.copyOfRange(saida, 0, count);
	}

	/**
	 * Separa todos elementos pares e impares e os adiciona em um vetor de
	 * vetores, onde o vetor 0 é armazenado os pares e o vetor 1 os impares.
	 * 
	 * Exemplo: int[] entrada = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
	 * 
	 * int[][] resultado = while.getParesImpares(entrada)
	 * 
	 * int[] pares = resultado[0] int[] impares = resultado[1]
	 * 
	 * pares == { 0, 2, 4, 6, 8, 10 } impares == { 1, 3, 5, 7, 9 }
	 * 
	 * @param elementos
	 * @return
	 */
	public int[][] getParesImpares(int[] elementos) {
		final int[][] saida = new int[elementos.length][2];
		final int[] pares = new int[elementos.length];
		final int[] impares = new int[elementos.length];
		int iPar = 0;
		int iImpar = 0;
		while (iPar + iImpar < elementos.length) {
			final int i = iPar + iImpar;
			if (elementos[i] % 2 == 0) {
				pares[iPar] = elementos[i];
				iPar++;
			} else {
				impares[iImpar] = elementos[i];
				iImpar++;
			}
		}
		saida[0] = pares;
		saida[1] = impares;

		return saida;
	}

	/**
	 * Encontrar o maior elemento do array, caso vazio retornar
	 * Integer.MIN_VALUE
	 * 
	 * @param elementos
	 * @return
	 */
	public int getMaior(int[] elementos) {
		if (elementos.length == 0)
			return Integer.MIN_VALUE;
		int maior = Integer.MIN_VALUE;
		int i = 0;
		while (i < elementos.length) {
			if (elementos[i] > maior)
				maior = elementos[i];
			i++;
		}

		return maior;
	}

	/**
	 * Encontrar o menor elemento do array, caso vazio retornar
	 * Integer.MIN_VALUE
	 * 
	 * @param elementos
	 * @return
	 */
	public int getMenor(int[] elementos) {
		if (elementos.length == 0)
			return Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int i = 0;
		while (i < elementos.length) {
			if (elementos[i] < menor)
				menor = elementos[i];
			i++;
		}
		return menor;
	}
}
