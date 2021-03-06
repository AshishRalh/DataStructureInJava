package com.LeetCode.Arrays;

//Given an integer n and an integer start.
//Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
//Return the bitwise XOR of all elements of nums.
//Example 1:
//Input: n = 5, start = 0
//Output: 8
//Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
//Where "^" corresponds to bitwise XOR operator.

public class XOROperationInArray {
    public static void main(String[] args){
        System.out.println(xorOperation(4, 3));
    }

    public static int xorOperation(int n, int start) {
        int xorAns = start;
        for (int i = 1; i < n; i++) {
            xorAns = xorAns ^ (start + (2 * i));
        }
        return xorAns;
    }
}
