package com.leetcode.SearchInsertPosition;

public class Solution35 {

  public int searchInsert(int[] nums, int target) {
    int resultado = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        resultado = i;
        break;
      } else {
        if (nums[i] > target) {
          resultado = i;
          break;
        } else {
          resultado = nums.length;
        }
      }
    }
    return resultado;
  }

}