package com.leetcode.RemoveDuplicatesFromSortedArray;

import java.util.Map;
import java.util.HashMap;

public class Solution26 {

  public static int removeDuplicates(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    int contador = 0;
    map.put(contador, nums[0]);

    for (int i = 0; i < nums.length; i++) {
      if (!map.containsValue(nums[i])) {
        contador++;
        System.out.println(contador);
        map.put(contador, nums[i]);
        System.out.println("hago inserción");
       
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(i)) {
        nums[i] = map.get(i);
      }
    }

    return map.size();
    }
}
