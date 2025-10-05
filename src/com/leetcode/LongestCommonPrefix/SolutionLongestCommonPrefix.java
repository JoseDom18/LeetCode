package com.leetcode.LongestCommonPrefix;
public class SolutionLongestCommonPrefix {

  public static String longestCommonPrefix(String[] strs) {
    StringBuilder respuesta = new StringBuilder();

    if (strs.length == 1) {
      respuesta.append(strs[0]);
      return respuesta.toString();
    }

    for (String s : strs) {
      if (s.length() == 0) {
        respuesta.append("");
        return respuesta.toString();
      }
    }

    int limite = strs.length;
    String aux = "";

    for (int i = 0; i < limite; i++) {
      for (int j = 0; j < limite - i - 1; j++) {
        if (strs[j].length() > strs[j + 1].length()) {
          aux = strs[j];
          strs[j] = strs[j + 1];
          strs[j + 1] = aux;
        }
      }
    }

    char[] wordPadre = strs[0].toCharArray();
    boolean isEqual = false;
    int numeroCaracter = 0;
    
    int limitePadre = strs[0].length();

    for (int l = 0; l < limitePadre; l++) {
      for (int k = 1; k < limite; k++) {
        char[] wordX = strs[k].toCharArray();
        if (wordPadre[numeroCaracter] == wordX[numeroCaracter]) {
          isEqual = true;
        } else {
          return respuesta.toString();
        }
      }
      if (isEqual) {
        respuesta.append(wordPadre[numeroCaracter]);
      }
      numeroCaracter += 1;
    }
    return respuesta.toString();
  }
}

// StringBuilder respuesta = new StringBuilder();
// int numeroCaracter = 0;
// int limite = strs.length;
// char[] word0 = strs[0].toCharArray();
// boolean isTrue = true;

// while (isTrue) {
//   for (int i = 0; i < limite; i++) {
//     char[] wordX = strs[i].toCharArray();
//     if (word0[numeroCaracter] != wordX[numeroCaracter]) {
//       isTrue = false;
//       break;
//     } else {
//     }
//   }
//   if (isTrue) {
//     respuesta.append(word0[numeroCaracter]);
//   }
//   numeroCaracter += 1;
// }

// return respuesta.toString();