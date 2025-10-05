package com.leetcode.RemoveElement;

public class Escenario27 {
  public static void main(String[] args) {
    int[] nums = {3, 2, 2, 3}; // Input array

    int val = 3; // Value to remove
//    int[] expectedNums = {2, 2}; // The expected answer with correct length.
                                // It is sorted with no values equaling val.

    int k = Solution27.removeElement(nums, val); // Calls your implementation

    System.out.println(k);
    // assert k == expectedNums.length;
    // sort(nums, 0, k); // Sort the first k elements of nums
    // for (int i = 0; i < actualLength; i++) {
    //     assert nums[i] == expectedNums[i];
    // }
  }
}
