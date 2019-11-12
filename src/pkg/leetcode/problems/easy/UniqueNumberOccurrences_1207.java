package pkg.leetcode.problems.easy;

import java.util.HashMap;

/****
 * 
 * Given an array of integers arr, write a function that returns true if and
 * only if the number of occurrences of each value in the array is unique.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: arr = [1,2,2,1,1,3] Output: true Explanation: The value 1 has 3
 * occurrences, 2 has 2 and 3 has 1. No two values have the same number of
 * occurrences. Example 2:
 * 
 * Input: arr = [1,2] Output: false Example 3:
 * 
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0] Output: true
 * 
 * 
 * Constraints:
 * 
 * 1 <= arr.length <= 1000 -1000 <= arr[i] <= 1000
 *
 */

public class UniqueNumberOccurrences_1207 {

	public boolean uniqueOccurrences(int[] arr) {
		// get the counts for each number in the arr using hashmap
		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> uniqueCounts = new HashMap<Integer, Integer>();

		// get values for each entryset of Hashmap1 and try to insert into hashmap2 if
		// the key exists then return false else end of it return true
		for (int i = 0; i < arr.length; i++) {
			if (counts.containsKey(arr[i])) {
				counts.put(arr[i], counts.get(arr[i]) + 1);
			} else {
				counts.put(arr[i], 1);
			}
		}

		for (int value : counts.values()) {
			if (uniqueCounts.containsKey(value)) {
				return false;
			}
			uniqueCounts.put(value, 1);

		}

		return true;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 1, 1, 3 };
		int[] arr2 = { 1, 2 };
		int[] arr3 = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		UniqueNumberOccurrences_1207 uno = new UniqueNumberOccurrences_1207();
		System.out.println(uno.uniqueOccurrences(arr1));
		System.out.println(uno.uniqueOccurrences(arr2));
		System.out.println(uno.uniqueOccurrences(arr3));

	}

}
