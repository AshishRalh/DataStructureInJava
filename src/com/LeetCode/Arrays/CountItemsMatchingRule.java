package com.LeetCode.Arrays;

//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
//The ith item is said to match the rule if one of the following is true:
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.
//Return the number of items that match the given rule.
//Example 1:
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

import java.util.*;

public class CountItemsMatchingRule {
    public static  void main(String[] args){
        List<String> list1 = Arrays.asList("phone","blue","pixel");
        List<String> list2 = Arrays.asList("computer","silver","lenovo");
        List<String> list3 = Arrays.asList("phone","gold","iphone");
        List<List<String>> items = new ArrayList<List<String>>();
        items.add(list1);
        items.add(list2);
        items.add(list3);
        System.out.println(countMatches(items, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2 ;
        int totalItems = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) totalItems++;
        }
        return totalItems;
    }
}
