package com.leetcode.FindLuckyIntegerInAnArray;

public class SolutionFindLuckyIntegerInAnArray {

  public int findLucky(int[] arr) {

    int lucky = -1;

    for (int i = 0; i < arr.length; i++) {
      int c = 0;
      int n = arr[i];
      if (n <= arr.length) {
        for (int same : arr) {
          if (n == same) {
            c++;
          }

          if (c == arr.length) {
            return c;
          }
        }
        if (c == n) {
          if (lucky <= n) {
            lucky = n;
          }
        }
      }

    }
    return lucky;
  }

}
