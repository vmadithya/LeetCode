package pkg.leetcode.problems.easy;

import java.util.Stack;

/********
 * 
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * 
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * 
 * Return the maximum amount of splitted balanced strings.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "RLRRLLRLRL" Output: 4 Explanation: s can be split into "RL",
 * "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 * Example 2:
 * 
 * Input: s = "RLLLLRRRLR" Output: 3 Explanation: s can be split into "RL",
 * "LLLRRR", "LR", each substring contains same number of 'L' and 'R'. Example
 * 3:
 * 
 * Input: s = "LLLLRRRR" Output: 1 Explanation: s can be split into "LLLLRRRR".
 * Example 4:
 * 
 * Input: s = "RLRRRLLRLL" Output: 2 Explanation: s can be split into "RL",
 * "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 1000 s[i] = 'L' or 'R'
 *
 */

public class SplitBalanceString_1221 {

	public int balancedStringSplit(String s) {
		Stack<Character> stack = new Stack<Character>();
		// insert the chars of the balanced string into the stack in reverse order
		for (int i = s.length()-1; i >= 0; i--) {
			stack.push(s.charAt(i));
		}
		// pop the stack until they are balanced and increase the counter once they are
		// balanced do this until the stack is empty
		int balancedCounter = 0, lCount = 0, rCount = 0;

		while (!stack.empty()) {
			if (stack.pop() == 'L')
				lCount++;
			else
				rCount++;

			if (lCount == rCount) {
				// reset the counters
				lCount = 0;
				rCount = 0;
				balancedCounter++;
			}
		}
		return balancedCounter;
	}

	public static void main(String[] args) {
		String s1 = "RLRRLLRLRL", s2 = "RLLLLRRRLR", s3 = "LLLLRRRR", s4 = "RLRRRLLRLL";
		

		SplitBalanceString_1221 sbs = new SplitBalanceString_1221();

		System.out.println(sbs.balancedStringSplit(s1));
		System.out.println(sbs.balancedStringSplit(s2));
		System.out.println(sbs.balancedStringSplit(s3));
		System.out.println(sbs.balancedStringSplit(s4));

	}

}
