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
public class ForSimples {

	/**
	 * Filtra elementos pares.
	 * 
	 * @param entrada
	 * @return
	 */
	public int[] filtraPares(int[] entrada) {
		final int[] auxiliar = new int[entrada.length];
		int count = 0;
		for (int i = 0; i < entrada.length; i++) {
			if (entrada[i] % 2 == 0) {
				auxiliar[count] = entrada[i];
				count++;
			}
		}

		return Arrays.copyOfRange(auxiliar, 0, count);
	}

	/**
	 * Filtra elementos maiores ou iguais ao parametro
	 * 
	 * @param entrada
	 * @param limite
	 * @return
	 */
	public int[] filtraMaioresOuIguais(int[] entrada, int limite) {
		final int[] auxiliar = new int[entrada.length];
		int count = 0;
		for (int i = 0; i < entrada.length; i++) {
			if (entrada[i] >= limite) {
				auxiliar[count] = entrada[i];
				count++;
			}
		}

		return Arrays.copyOfRange(auxiliar, 0, count);
	}

	/**
	 * Filtra elementos menores que o parametro limite.
	 * 
	 * @param entrada
	 * @param limite
	 * @return
	 */
	public int[] filtraMenores(int[] entrada, int limite) {
		final int[] auxiliar = new int[entrada.length];
		int count = 0;
		for (int i = 0; i < entrada.length; i++) {
			if (entrada[i] < limite) {
				auxiliar[count] = entrada[i];
				count++;
			}
		}

		return Arrays.copyOfRange(auxiliar, 0, count);
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
		final String[] resultado = new String[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			resultado[i] = prefixo + entrada[i];
		}

		return resultado;
	}

	/**
	 * Transforma o array de strings passado como argumento em um array de
	 * doubles.
	 * 
	 * @param entrada
	 * @return
	 */
	public double[] transformarEmDouble(String[] entrada) {
		final double[] resultado = new double[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			resultado[i] = Double.parseDouble(entrada[i]);
		}

		return resultado;
	}

	/**
	 * Gera a sequência numérica apartir do limiteInferior até o limiteSuperior.
	 * 
	 * @param limiteInferior
	 * @param limiteSuperior
	 * @return
	 */
	public int[] gerarNumerosEntre(int limiteInferior, int limiteSuperior) {
		final int tamanhoVetor = (limiteSuperior - limiteInferior) + 1;
		final int[] resultado = new int[tamanhoVetor];
		int count = 0;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultado[count] = i;
			count++;
		}

		return resultado;
	}

	public int[] gerarNumerosParesEntre(int limiteInferior, int limiteSuperior) {
		final int[] resultado = new int[limiteSuperior - limiteInferior];
		int count = 0;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			if (i % 2 == 0) {
				resultado[count] = i;
				count++;
			}
		}
		return Arrays.copyOfRange(resultado, 0, count);
	}

	/**
	 * Gera todos números pares apartir do limiteInferior até o limiteSuperior
	 * 
	 * @param limiteInferior
	 * @param limiteSuperior
	 * @return
	 */
	public int[] gerarNumerosPares(int limiteInferior, int limiteSuperior) {
		final int[] saida = new int[limiteSuperior - limiteInferior];
		int count = 0;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			if (i % 2 == 0) {
				saida[count] = i;
				count++;
			}
		}

		return Arrays.copyOfRange(saida, 0, count);
	}

	/**
	 * Retorna a posição do elemento dentro do array elementos. Caso o valor não
	 * seja encontrado retornar -1
	 * 
	 * @param elemento
	 * @param elementos
	 * @return
	 */
	public int getPosicao(String elemento, String[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i].equals(elemento))
				return i;
		}

		return -1;
	}

}
