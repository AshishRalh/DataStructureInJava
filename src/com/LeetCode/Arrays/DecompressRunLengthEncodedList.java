package com.LeetCode.Arrays;

import java.util.Arrays;

//We are given a list nums of integers representing a list compressed with run-length encoding.
//Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
//Return the decompressed list.
//Example 1:
//Input: nums = [1,2,3,4]
//Output: [2,4,4,4]
//Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{5,11,7,26,6,64})));
    }

    public static int[] decompressRLElist(int[] nums) {
        int[] array = new int[0];
        for (int i = 0; i < nums.length; i+=2) {
            int[] newArray = new int[nums[i] + array.length];
            System.arraycopy(array, 0, newArray, 0, array.length);
            for (int j = array.length; j < newArray.length; j++) {
                newArray[j] = nums[i + 1];
            }
            array = newArray;
        }
        System.out.println(array.length);
        return array;
    }
}
