/**
 * 
 */
package pkg.problems.easy;

/**
 * Given a matrix A, return the transpose of A.
 * 
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [[1,2,3],[4,5,6],[7,8,9]] Output: [[1,4,7],[2,5,8],[3,6,9]] Example 2:
 * 
 * Input: [[1,2,3],[4,5,6]] Output: [[1,4],[2,5],[3,6]]
 * 
 * 
 * Note:
 * 
 * 1 <= A.length <= 1000 1 <= A[0].length <= 1000
 *
 */
public class MatrixTranspose_867 {
	public int[][] transpose(int[][] A) {
		int result[][] = new int[A[0].length][A.length];
		for (int i = 0; i < A[0].length; i++) {
			for (int j = 0; j < A.length; j++) {
				result[i][j] = A[j][i];
			}
		}
		return result;

	}

	public static void main(String[] args) {
		MatrixTranspose_867 mt = new MatrixTranspose_867();
		int input1[][] = { { 1,2,3}, { 4,5,6 }, { 7,8,9 } };

		int input2[][] = { { 1,2,3}, { 4,5,6 }};

		int[][] res = mt.transpose(input1);

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {

				System.out.print(" " + res[i][j]);
			}
			System.out.println(' ');
		}

	}

}
