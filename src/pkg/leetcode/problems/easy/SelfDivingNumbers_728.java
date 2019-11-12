package pkg.leetcode.problems.easy;

import java.util.LinkedList;
import java.util.List;

/*****
 * 
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
 *
 */

public class SelfDivingNumbers_728 {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> output = new LinkedList<Integer>();
		for (int i = left; i <= right; i++) {
			String currentVar = Integer.toString(i);
			if (!currentVar.contains("0")) {
				int currValueLength = currentVar.length();
				int calLength = 0;
				for (char c : currentVar.toCharArray()) {

					if (i % Integer.parseInt(c + "") == 0) {
						calLength++;
					}
				}
				if (currValueLength == calLength) {
					output.add(i);
				}
			}
		}
		return output;

	}

	public static void main(String[] args) {
		SelfDivingNumbers_728 sdn = new SelfDivingNumbers_728();
		System.out.println(sdn.selfDividingNumbers(1, 22));
	}

}
