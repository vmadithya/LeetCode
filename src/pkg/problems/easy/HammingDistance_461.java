/**
 * 
 */
package pkg.problems.easy;

/**
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * Note: 0 ≤ x, y < 231.
 * 
 * Example:
 * 
 * Input: x = 1, y = 4
 * 
 * Output: 2
 * 
 *
 *
 */
public class HammingDistance_461 {

	public int hammingDistance(int x, int y) {

		int result, temp = 0;
		temp = x ^ y;
		result = Integer.bitCount(temp);
		return result;

	}

	public static void main(String[] args) {
		HammingDistance_461 hd = new HammingDistance_461();
		int res = hd.hammingDistance(1, 4);

		System.out.println(res);

	}

}
