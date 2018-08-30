/**
 * 
 */
package pkg.problems.cleancode;

/**
 * 
 *
 */
public class TwoSumSorted {

	private int[] twoSumSorted(int[] in, int target) {
		// array is already sorted
		for (int i = 0; i < in.length; i++) {
			int j = bsearch(in, target - in[i], i + 1);
			if (j != -1)
				return new int[] { i + 1, j + 1 };
		}

		throw new IllegalArgumentException("No Two Sum sorted Solution");
	}

	private int bsearch(int[] A, int key, int start) {
		int L = start, R = A.length - 1;
		while (L < R) {
			int M = (L + R) / 2;
			if (A[M] < key) {
				L = M + 1;
			} else {
				R = M;
			}
		}
		return (L == R && A[L] == key) ? L : -1;
	}

	public int[] twoSum(int[] numbers, int target) { // Assume input is already sorted.
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		TwoSumSorted ts = new TwoSumSorted();
		int[] in = { 3, 11, 12, 22, 31, 32 };
		int[] in_1 = { 1,2,3,4};
		int[] result = ts.twoSumSorted(in, 35);

		for (int i : result) {
			System.out.println("  " + i);
		}

		int[] result_1 = ts.twoSum(in_1, 5);

		for (int i : result_1) {
			System.out.println("  " + i);
		}

	}

}
