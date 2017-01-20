/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.loop;

/**
 * 
 * @author rochapaulo
 *
 */
public class Matriz {

	private Matriz() {
		super();
	}

	/**
	 * Cria um array multi dimensional (linhas x colunas) e inicializa todas
	 * celulas com -1
	 * 
	 * @param linhas
	 * @param colunas
	 * @return
	 */
	public static int[][] criaMatriz(int linhas, int colunas) {
		final int[][] resultado = new int[colunas][linhas];
		for (int x = 0; x < colunas; x++) {
			for (int y = 0; y < linhas; y++) {
				resultado[x][y] = -1;
			}
		}

		return resultado;
	}

	/**
	 * Recuperar o elemento requisitado
	 * 
	 * @param matriz
	 * @param linha
	 * @param coluna
	 * @return
	 */
	public static int getElemento(int[][] matriz, int linha, int coluna) {
		return matriz[linha][coluna];
	}

	/**
	 * Multiplica cada elemento da matriz pelo fator de multiplicação
	 * 
	 * @param matriz
	 * @param fatorMultiplicacao
	 * @return
	 */
	public static int[][] multiplicaPor(int[][] matriz, int fatorMultiplicacao) {
		final int linhas = matriz.length;
		final int colunas = matriz[0].length;
		final int[][] resultado = new int[linhas][colunas];
		for (int x = 0; x < linhas; x++) {
			for (int y = 0; y < colunas; y++) {
				resultado[x][y] = matriz[x][y] * fatorMultiplicacao;
			}
		}

		return resultado;
	}

}
