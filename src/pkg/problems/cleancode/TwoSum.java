/**
 * 
 */
package pkg.problems.cleancode;

import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number. The function twoSum should return indices of the two
 * numbers such that they add up to the target, where index1 must be less than
 * index2. Please note that your returned answers (both index1 and index2) are
 * not zero-based. You may assume that each input would have exactly one
 * solution.
 *
 */
public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {

		// Using HashMap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			// Check if there is a key already present in the hasmap for target-numbers[i]
			if (map.containsKey(target - x)) {
				return new int[] { map.get(target - x) + 1, i + 1 };
			}
			map.put(x, i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] in = { 3, 12, 11, 22, 31, 32 };
		int[] result = ts.twoSum(in, 14);

		for (int i : result) {
			System.out.println("  " + i);
		}
	}

}
