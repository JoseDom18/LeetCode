package com.leetcode.FindTheIndexOfTheFirstOccurrenceInaString;

public class Solution28 {
  public static int strStr(String haystack, String needle) {

    String start1 = "";
    int res = -1;
    
    for (int i = 0; i < haystack.length(); i++) {
      if (i + needle.length() <= haystack.length()) {
        start1 = haystack.substring(i, i + needle.length());
      }

      if (start1.equals(needle)) {
        res = i;
        return res;
      }
    }

    return res;
  }
}
