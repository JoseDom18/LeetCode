package com.leetcode.LengthOfLastWord;

public class Solution58 {
  public static int solucion(String s) {

      int cont = 0;
      int j = 0;

      for(int i = 0; i < s.length(); i++) {
        
          if (s.charAt(i) != ' ') {
            j = i;
          }
        }

      for(int i = j; i >= 0 ;i--) {
        if (s.charAt(i) != ' '){
          cont++;
        } else {
          break;
        }
      }
          return cont;
    }

  }


