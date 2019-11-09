package pkg.leetcode.problems.easy;

import java.util.HashMap;

/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice. Example:
 * Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 =
 * 9, return [0, 1].
 */

/*
 * Brute Force - O(n^2)
 */

public class TwoSum_1 {

	public void bruteForceTwoSum(int[] input, int target) {
		// for every element i, do a lookup for target - i --> if present then return
		// the index of i and new index end if i has exhausted the loop

		for (int i = 0; i < input.length; i++) {
			// corner case if i th element itself is the target
			if (input[i] == target)
				System.out.println("Two Sum is the one index: " + i);

			int dif = target - input[i];
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] == dif) {
					System.out.println("There is a match, the indexs are " + i + " and " + j);
					return;
				}
			}

		}
	}

	public int [] twoSum(int[] input, int target) {
		// put the elements into a HashMap key is inputs and value being index
		// retriveValue from hashmap for(target - input[i] , if present then return i
		// and value

		// initialize HashMap
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			if (hm.containsKey(target - input[i])) {
				System.out.println("There is a match, the indexs are " + i + " and " + hm.get(target - input[i]));
				return new int [] {i , hm.get(target - input[i])};
			} else
				hm.put(input[i], i);
				
			
		}
		// more effecient way to do it would be to initialize on the fly while doing a
		// look up for the number, if key not found then add the new entry
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {

		TwoSum_1 invoker = new TwoSum_1();

		int[] nums = { 3, 2, 4 };
		int target = 6;

		invoker.bruteForceTwoSum(nums, target);

		invoker.twoSum(nums, target);

	}

}
