package pkg.leetcode.problems.easy;

/**********
 * 
 * Let's call an array A a mountain if the following properties hold:
 * 
 * A.length >= 3 There exists some 0 < i < A.length - 1 such that A[0] < A[1] <
 * ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] Given an array that is
 * definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i]
 * > A[i+1] > ... > A[A.length - 1].
 * 
 * Example 1:
 * 
 * Input: [0,1,0] Output: 1 Example 2:
 * 
 * Input: [0,2,1,0] Output: 1 Note:
 * 
 * 3 <= A.length <= 10000 0 <= A[i] <= 10^6 A is a mountain, as defined above.
 *
 */

public class PeakIndexInMountainArray_852 {

	public int peakIndexInMountainArray(int[] A) {

		// as the array contains min of 3 elements - check for the condition a[i] <
		// a[i+1] and a[i+1] > a[i+2] till length - 2

		for (int i = 0; i <= A.length - 3; i++) {
			if (A[i] < A[i + 1] && A[i + 1] > A[i + 2]) {
				return i + 1;
			}
		}
		return -1;

	}
	
	//work on the Binary Search solution for a O(log n) time complexity

	public static void main(String[] args) {
		PeakIndexInMountainArray_852 pima = new PeakIndexInMountainArray_852();
		System.out.println(pima.peakIndexInMountainArray(new int[] { 0, 1, 0 }));
		System.out.println(pima.peakIndexInMountainArray(new int[] { 0, 2, 1, 0 }));

	}

}
