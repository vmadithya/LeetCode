package pkg.leetcode.problems.easy;

/*****
 * 
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [3,1,2,4] Output: [2,4,3,1] The outputs [4,2,3,1], [2,4,1,3], and
 * [4,2,1,3] would also be accepted.
 * 
 * 
 * Note:
 * 
 * 1 <= A.length <= 5000 0 <= A[i] <= 5000
 *
 */

public class SortArrayByParity_905 {

	public int[] sortArrayByParity(int[] A) {

		// have two indices to the array, left and right while left is <= right

		// check until the left points to odd and right points to even, swap if this
		// condition meets
		int leftIndex = 0;
		int rightIndex = A.length - 1;

		int[] output = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				output[leftIndex] = A[i];
				leftIndex++;
			} else {
				output[rightIndex] = A[i];
				rightIndex--;

			}

		}

		return output;

	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 3 };
		SortArrayByParity_905 sa = new SortArrayByParity_905();
		System.out.println(sa.sortArrayByParity(input));

	}

}
