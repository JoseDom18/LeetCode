package com.leetcode.AddBinary;

public class Solution67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given two binary strings a and b, return their sum as a binary string.
//
//				Example 1:
//
//				Input: a = "11", b = "1"
//				Output: "100"
//				Example 2:
//
//				Input: a = "1010", b = "1011"
//				Output: "10101"
//
//				Constraints:
//
//				1 <= a.length, b.length <= 104
//				a and b consist only of '0' or '1' characters.
//				Each string does not contain leading zeros except for the zero itself.

		String a = "1";
		String b = "0";

		addBinary(a, b);
	}

	public static String addBinary(String a, String b) {
		String ls = ""; // respuesta
		String maximo = a; // determina el string de mayor tamaño
		String minimo = b;

//		if (a.length() == 1 && b.length() == 1 && a.charAt(0) == '0' && b.charAt(0) == '0') return "0";

		// determinar string mas grande
		if (minimo.length() > maximo.length()) {
			maximo = b;
			minimo = a;
		}

		// arrays de Strings
		String[] aB = { maximo, minimo };
		// arrays de punteros
		int[] punteros = { maximo.length() - 1, minimo.length() - 1 };

		// crear punteros
		int punteroMaximo = maximo.length();

		// crear matriz rectangular
		int[][] arr = new int[5][punteroMaximo + 1];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = 48;
			}
		}

		// ingresar cadenas en matriz
		for (int i = 0; i < 2; i++) {
			int posicion = arr[0].length - 1;
			while (punteros[i] >= 0) {
				arr[i][posicion] = aB[i].charAt(punteros[i]);
				punteros[i]--;
				posicion--;
			}
		}

		// operaciones
		for (int i = 0; i <= 2; i += 2) { // loop para compara fila 1 y fila 2; fila 3 y fila 4
			for (int j = arr[0].length - 1; j >= 0; j--) {
				if (arr[i][j] == arr[i + 1][j]) {
					arr[i + 2][j] = 48;
					if (arr[i][j] == 49) {
						arr[3][j - 1] = 49;
					}
				} else {
					arr[i + 2][j] = 49;
				}
			}
		}

		// guardar los char en String
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[arr.length - 1][0] == 48 && i == 0)
				continue;
			char valor = (char) arr[arr.length - 1][i];
			ls += valor;
		}
		
		return ls;
	}
}
