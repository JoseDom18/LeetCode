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

		String a = "11";
		String b = "1";
	}

	public static String addBinary(String a, String b) {
		char acarreo = ' '; // se vuelve uno si la suma es 1 + 1
		String ls = ""; // respuesta
		String maximo = a; // determina el string de mayor tamaño
		String minimo = b;
		String suma;
		
		// determinar string mas grande
		if (minimo.length() > maximo.length()) {
			maximo = b;
			minimo = a;
		}
		
		// crear punteros
		int punteroMaximo = maximo.length() - 1;
		int punteroMinimo = minimo.length() - 1;

		while (true) {
			if(maximo.charAt(punteroMaximo) != minimo.charAt(punteroMinimo)) {
				if (maximo.charAt(punteroMaximo) == 1 && minimo.charAt(punteroMinimo) == 1) {
					acarreo = '1';
				}
				ls += "1";
				punteroMaximo--;
				punteroMinimo--;
			} else {
				ls += "0";
				punteroMaximo--;
				punteroMinimo--;
			}
		}
		return ls;
	}
}
