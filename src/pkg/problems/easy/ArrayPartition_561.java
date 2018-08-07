/**
 * 
 */
package pkg.problems.easy;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n
 * pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of
 * min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * Example 1: Input: [1,4,3,2]
 * 
 * Output: 4 Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2)
 * + min(3, 4). Note: n is a positive integer, which is in the range of [1,
 * 10000]. All the integers in the array will be in the range of [-10000,
 * 10000].
 *
 */
public class ArrayPartition_561 {

	public int arrayPairSum(int[] nums) {
		int res = 0;
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length ; i=i+2) {
			if(nums[i] < nums [i+1]) {
				res = res + nums[i];
			}
			else {
				res = res + nums[i+1];
			}
		}
		
		return res;

	}

	public static void main(String[] args) {
		ArrayPartition_561 ap = new ArrayPartition_561();
		
		int[] input = {1,4,3,2};
		int[] input2 = {-8,8,7,6,-6,-5};
		
		System.out.println(ap.arrayPairSum(input));
		System.out.println(ap.arrayPairSum(input2));
		
	}

}
