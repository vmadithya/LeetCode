/**
 * 
 */
package pkg.problems.easy;

/**
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
public class PeakIndixInAMountain {
	private int binsearch(int[] A, int s, int e) {
		int m = (s + e) / 2;
		if (m == 0 || m == A.length)
			return m;
		if (A[m - 1] < A[m] && A[m] < A[m + 1])
			return binsearch(A, m + 1, e);
		if (A[m - 1] > A[m] && A[m] > A[m + 1])
			return binsearch(A, s, m - 1);
		return m;
	}

	public int peakIndexInMountainArray(int[] A) {
		if (A.length < 3)
			return -1;
		return binsearch(A, 0, A.length - 1);
	}

	public static void main(String[] args) {
		PeakIndixInAMountain pim = new PeakIndixInAMountain();

		int[] input = { 0, 1, 0 };
		int[] input2 = {0,2,1,0};

		System.out.println(pim.peakIndexInMountainArray(input));
		System.out.println(pim.peakIndexInMountainArray(input2));
	}

}
