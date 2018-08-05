/**
 * 
 */
package pkg.problems.easy;

/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert
 * it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * 
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced
 * by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * Example 1:
 * 
 * Input: [[1,1,0],[1,0,1],[0,0,0]] Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]]. Then, invert
 * the image: [[1,0,0],[0,1,0],[1,1,1]] Example 2:
 * 
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] Output:
 * [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]] Explanation: First reverse each
 * row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]. Then invert the image:
 * [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 */
public class FlippingAnImage_832 {

	public int[][] flipAndInvertImage(int[][] A) {
		int result[][] = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			int tempCntr = A[i].length;
			for (int j = 0; j < A[i].length; j++) {
				// reverse the row while inverting the bit
				if (A[i][j] == 0)
					result[i][tempCntr - 1] = 1;
				if (A[i][j] == 1)
					result[i][tempCntr - 1] = 0;

				tempCntr--;
			}
		}

		return result;

	}

	public static void main(String[] args) {

		FlippingAnImage_832 fai = new FlippingAnImage_832();
		int input1[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

		int input2[][] = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };

		int[][] res = fai.flipAndInvertImage(input2);

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {

				System.out.print(" " + res[i][j]);
			}
			System.out.println(' ');
		}

	}

}
