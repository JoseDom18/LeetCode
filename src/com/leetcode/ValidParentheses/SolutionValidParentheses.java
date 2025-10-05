package com.leetcode.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SolutionValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> mapping = new HashMap<>();
    mapping.put(')', '(');
    mapping.put('}', '{');
    mapping.put(']', '[');

    for (char c : s.toCharArray()) {
      if (mapping.containsValue(c)) {
        stack.push(c);
      } else if (mapping.containsKey(c)) {
        if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
          return false;
        }

      }
    }
    return stack.isEmpty();
  }
}

/*
 * Como lo queria hacer
 * boolean wltl = true;
 * char[] palabra = s.toCharArray();
 * 
 * Map<Character, Integer> map = new HashMap<>();
 * 
 * for (char a : palabra) {
 * map.put(a, map.getOrDefault(a, 0) + 1);
 * }
 * 
 * if ((map.getOrDefault('(', 0) - map.getOrDefault(')', 0) == 0)
 * && (map.getOrDefault('[', 0) - map.getOrDefault(']', 0) == 0)
 * && (map.getOrDefault('{', 0) - map.getOrDefault('}', 0) == 0)) {
 * System.out.println("Es momento de analizar");
 * } else {
 * wltl = false;
 * }
 * 
 * 
 * 
 * 
 * 
 * return wltl;
 */
