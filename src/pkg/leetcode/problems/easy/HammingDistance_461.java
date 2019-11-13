package pkg.leetcode.problems.easy;

/*****
 * 
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
 * Explanation: 1 (0 0 0 1) 4 (0 1 0 0) ↑ ↑
 * 
 * The above arrows point to positions where the corresponding bits are
 * different.
 *
 */

public class HammingDistance_461 {

	public int reference_hammingDistance(int x, int y) {
		int xor = x ^ y;
		System.out.println(xor + " ---> " + Integer.toBinaryString(xor));
		int count = 0;
		while (xor != 0) {
			if ((xor & 1) == 1)
				count++;
			xor >>>= 1;
		}

		return count;
	}

	public int hammingDistance(int x, int y) {

		// convert the inputs to their bit representation
		String stringX = Integer.toBinaryString(x);
		String stringY = Integer.toBinaryString(y);

		int maxLen = stringX.length() > stringY.length() ? stringX.length() : stringY.length();
		StringBuffer sbx = new StringBuffer(maxLen);
		StringBuffer sby = new StringBuffer(maxLen);

		int result = 0;

		// pad 0s to the string
		if (stringX.length() == maxLen) {
			for (int i = 0; i < maxLen - stringY.length(); i++) {
				sby.append('0');
			}
			sby.append(stringY);
			sbx.append(stringX);

		} else {
			for (int i = 0; i < maxLen - stringX.length(); i++) {
				sbx.append('0');
			}
			sbx.append(stringX);
			sby.append(stringY);

		}

		for (int i = 0; i < maxLen; i++) {
			if (sbx.charAt(i) != sby.charAt(i))
				result++;
		}

		// take the XOR to get the hamming distance

		return result;

	}

	public static void main(String[] args) {
		HammingDistance_461 hd = new HammingDistance_461();
		hd.hammingDistance(1, 4);
		hd.reference_hammingDistance(1, 4);
	}

}
