package pkg.leetcode.problems.easy;

import java.util.Arrays;

/******
 * 
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [-4,-1,0,3,10] Output: [0,1,9,16,100] Example 2:
 * 
 * Input: [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 * 
 * Note:
 * 
 * 1 <= A.length <= 10000 -10000 <= A[i] <= 10000 A is sorted in non-decreasing
 * order.
 *
 */

//Solution Approach:
/*****
 * 
 * Intuition
 * 
 * Since the array A is sorted, loosely speaking it has some negative elements
 * with squares in decreasing order, then some non-negative elements with
 * squares in increasing order.
 * 
 * For example, with [-3, -2, -1, 4, 5, 6], we have the negative part [-3, -2,
 * -1] with squares [9, 4, 1], and the positive part [4, 5, 6] with squares [16,
 * 25, 36]. Our strategy is to iterate over the negative part in reverse, and
 * the positive part in the forward direction.
 * 
 * Algorithm
 * 
 * We can use two pointers to read the positive and negative parts of the array
 * - one pointer j in the positive direction, and another i in the negative
 * direction.
 * 
 * Now that we are reading two increasing arrays (the squares of the elements),
 * we can merge these arrays together using a two-pointer technique.
 *
 */

public class SquaresOfASortedArray_977 {

	public int[] sortedSquares(int[] A) {

		int[] result = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			result[i] = A[i] * A[i];
		}
		Arrays.sort(result);
		return result;

	}

	public static void main(String[] args) {
		int[] A1 = { -4, -1, 0, 3, 10 };
		int[] A2 = { -7, -3, 2, 3, 11 };
		SquaresOfASortedArray_977 sosa = new SquaresOfASortedArray_977();
		System.out.println(sosa.sortedSquares(A1));
		System.out.println(sosa.sortedSquares(A2));

	}

}
