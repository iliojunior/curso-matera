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
public class ForEach {

	/**
	 * Filtra elementos pares.
	 * 
	 * @param entrada
	 * @return
	 */
	public int[] filtraPares(int[] entrada) {
		final int[] saida = new int[entrada.length];
		int count = 0;
		for (int i : entrada) {
			if (i % 2 == 0) {
				saida[count] = i;
				count++;
			}
		}
		return Arrays.copyOfRange(saida, 0, count);
	}

	/**
	 * Filtra elementos maiores ou iguais ao parametro
	 * 
	 * @param entrada
	 * @param limite
	 * @return
	 */
	public int[] filtraMaioresOuIguais(int[] entrada, int limite) {
		final int[] saida = new int[entrada.length];
		int count = 0;
		for (int item : entrada) {
			if (item >= limite) {
				saida[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(saida, 0, count);
	}

	/**
	 * Filtra elementos menores que o parametro limite.
	 * 
	 * @param entrada
	 * @param limite
	 * @return
	 */
	public int[] filtraMenores(int[] entrada, int limite) {
		final int[] saida = new int[entrada.length];
		int count = 0;
		for (int item : entrada) {
			if (item < limite) {
				saida[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(saida, 0, count);
	}

	/**
	 * Transforma array de entrada em outro array do tipo String concatenando
	 * seus valores com o prefixo informado.
	 * 
	 * @param entrada
	 * @param prefixo
	 * @return
	 */
	public String[] transformaUsandoPrefixo(int[] entrada, String prefixo) {
		final String[] saida = new String[entrada.length];
		int i = 0;
		for (int item : entrada) {
			saida[i] = prefixo + item;
			i++;
		}

		return saida;
	}

	/**
	 * Transforma o array de strings passado como argumento em um array de
	 * inteiros.
	 * 
	 * @param entrada
	 * @return
	 */
	public int[] transformarEmInteiros(String[] entrada) {
		final int[] saida = new int[entrada.length];
		int count = 0;
		for (String item : entrada) {
			saida[count] = Integer.parseInt(item);
			count++;
		}
		return saida;
	}

}
