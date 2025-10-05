package com.leetcode.PlusOne;

public class Solution66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//		Increment the large integer by one and return the resulting array of digits.
//
//		 
//
//		Example 1:
//
//		Input: digits = [1,2,3]
//		Output: [1,2,4]
//		Explanation: The array represents the integer 123.
//		Incrementing by one gives 123 + 1 = 124.
//		Thus, the result should be [1,2,4].
//		Example 2:
//
//		Input: digits = [4,3,2,1]
//		Output: [4,3,2,2]
//		Explanation: The array represents the integer 4321.
//		Incrementing by one gives 4321 + 1 = 4322.
//		Thus, the result should be [4,3,2,2].
//		Example 3:
//
//		Input: digits = [9]
//		Output: [1,0]
//		Explanation: The array represents the integer 9.
//		Incrementing by one gives 9 + 1 = 10.
//		Thus, the result should be [1,0].
//		 
//
//		Constraints:
//
//		1 <= digits.length <= 100
//		0 <= digits[i] <= 9
//		digits does not contain any leading 0's.
		
		int[] digits = { 1, 2 ,3};
		int[] res = Solution66.plusOne(digits);
		
		for(int i : res) {
			System.out.printf("[%d]", i);
		}

	}

	static int[] plusOne(int[] digits) {
		int lastDigit = digits.length - 1;
		
		if (digits[lastDigit] != 9) {
			digits[lastDigit]++;
			return digits;
		} else {
			digits[lastDigit]++;
			int p = lastDigit;
			while (digits[p] == 10) {
				if (p >= 1) {
					digits[p - 1]++;
					p--;
				} else break;
			}
			p = lastDigit;
			while (digits[p] == 10) {
				digits[p] = 0;
				p--; 
				if(p < 0) break;
			}
			if (digits[0] == 0) {
				int[] ls = new int[digits.length + 1];
				ls[0] = 1;
				for (int i = 1; i < digits.length; i++) {
					ls[i] = digits[i - 1];
				}
				return ls;
			}
		}
		return digits;
		
	}
}
