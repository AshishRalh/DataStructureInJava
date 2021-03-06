package com.LeetCode.Arrays;

//Given an array of integers nums.
//A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//Return the number of good pairs.
//Example 1:
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

public class NumberOfGoodPairs {
    public static void main(String[] args){
        int[] listOfNumbers = new int[]{1,2,3,1,1,3};
        int totalIdenticalPairs = numIdenticalPairs(listOfNumbers);
        System.out.println(totalIdenticalPairs);
    }

    public static int numIdenticalPairs(int[] nums) {
        int identicalPairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    identicalPairs = identicalPairs + 1;
                }
            }
        }
        return identicalPairs;
    }
}
