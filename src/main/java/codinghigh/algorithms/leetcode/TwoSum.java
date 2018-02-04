/*
 * Copyright (c) 2018 to Xinwei Jin.
 * All Rights Reserved.
 */

package codinghigh.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xinweijin on 1/28/18.
 * leetcode #1
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {
    /**
     * If the array is sorted in increasing order
     * two pointer (p1 -> the first number, p2 -> the second number)
     * if (nums[p1] + nums[p2] > target) move p2 to left -> p2--;
     * if (nums[p1] + nums[p2] < target) move p1 to right -> p1++;
     * if (nums[p1] + nums[p2] == target) find the result;
     *
     * @param nums input array
     * @param target target sum
     * @return the index array of the first and second number
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0) {
            return result;
        }
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                result[0] = left;
                result[1] = right;
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    /**
     * map<nums[i], i>
     * interate the nums array
     *  if the map contains the key target - nums[i], then return the result;
     *  push the pair<nums[i], i> to map
     *
     * @param nums input array
     * @param target target sum
     * @return the index array of the first and second number
     */
    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
