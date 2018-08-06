/**
 * 
 */
package pkg.problems.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self
 * dividing number, including the bounds if possible.
 * 
 * Example 1: Input: left = 1, right = 22 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9,
 * 11, 12, 15, 22] Note:
 * 
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDivingNumbers_728 {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<Integer>();

		// Iterate from left to right
		for (int i = left; i <= right; i++) {
			// get each element say 11 and convert to string to parse
			String s = Integer.toString(i);
			if (!s.contains("0")) {
				int cnt = 0;
				for (char c : s.toCharArray()) {
					if (i % Integer.parseInt(c + "") == 0) {
						cnt++;
					}
					if (cnt == s.length()) {
						res.add(i);
					}
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		SelfDivingNumbers_728 sdn = new SelfDivingNumbers_728();
		System.out.println((sdn.selfDividingNumbers(1, 22)));

	}

}
