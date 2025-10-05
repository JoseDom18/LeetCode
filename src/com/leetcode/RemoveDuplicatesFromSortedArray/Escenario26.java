package com.leetcode.RemoveDuplicatesFromSortedArray;

public class Escenario26 {
  public static void main(String[] args) {
    
    int[] nums = { 1, 1, 2 };
    int[] expectedNums = { 1, 2 };

    int k = Solution26.removeDuplicates(nums);

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }
}
