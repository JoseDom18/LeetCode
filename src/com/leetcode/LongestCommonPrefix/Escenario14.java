package com.leetcode.LongestCommonPrefix;

public class Escenario14 {
  public static void main(String[] args) {
    // Write a function to find the longest common prefix string amongst an array of
    // strings.

    // If there is no common prefix, return an empty string "".

    // Example 1:

    // Input: strs = ["flower","flow","flight"]
    // Output: "fl"
    // Example 2:

    // Input: strs = ["dog","racecar","car"]
    // Output: ""
    // Explanation: There is no common prefix among the input strings.

     String[] strs = { "flower", "flow", "flight" };
//    String[] strs = { "a" };

    System.out.println(SolutionLongestCommonPrefix.longestCommonPrefix(strs));
  }

}
