/*
 * MATERA Systems, Curso de F�rias 2017 - Maring�
 */
package com.materasystems.curso.ferias.loop;

/**
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
public class DoWhile {

	/**
	 * Gerar a tabuada do n�mero informado
	 * 
	 * @param numero
	 * @return
	 */
	public int[] getTabuada(int numero) {
		final int tamanho = 11;
		final int[] resultado = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			resultado[i] = numero * i;
		}

		return resultado;
	}

	/**
	 * Calcular a soma de todos os n�meros de 1 at� o en�simo termo.
	 * 
	 * int soma = somaTotal(enesimo) --> 1 + 2 + 3 + .. + enesimo
	 * 
	 * @param numero
	 * @return
	 */
	public int somaTotal(int enesimo) {
		int i = 1;
		int soma = 0;
		do {
			soma += i;
			i++;
		} while (i <= enesimo);

		return soma;
	}

}
