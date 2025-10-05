package com.leetcode.RemoveElement;

public class Solution27 {

  public static int removeElement(int[] nums, int val) {

    int cont = 0;
    int k = nums.length;

    if (k == 0 || val > 50) {
      return k;
    } else {
      for (int a : nums) {
        if (a == val) {
          cont++;
        }
      }
      if (cont == 0) {
        return k;
      } else {
        for (int i = 0; i < nums.length; i++) {
          for (int j = 0; j < nums.length - i - 1; j++) {
            if (nums[j] == val) {
              int aux = nums[j];
              nums[j] = nums[j + 1];
              nums[j + 1] = aux;
            }
          }
        }
      }
    }

    System.out.println(cont);
    return k - cont;

  }
}
