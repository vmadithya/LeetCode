package pkg.leetcode.problems.easy;

import java.util.Stack;

/*****
 * 
 * Given a string S of lowercase letters, a duplicate removal consists of
 * choosing two adjacent and equal letters, and removing them.
 * 
 * We repeatedly make duplicate removals on S until we no longer can.
 * 
 * Return the final string after all such duplicate removals have been made. It
 * is guaranteed the answer is unique.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: "abbaca" Output: "ca" Explanation: For example, in "abbaca" we could
 * remove "bb" since the letters are adjacent and equal, and this is the only
 * possible move. The result of this move is that the string is "aaca", of which
 * only "aa" is possible, so the final string is "ca".
 * 
 * 
 * Note:
 * 
 * 1 <= S.length <= 20000 S consists only of English lowercase letters.
 *
 */

public class RemoveAllAdjacentDuplicatesInString_1047 {
	public String removeDuplicates(String S) {

		// use stack to solve this problem, before pushing into the stack, check if the
		// peek is equal to element to be inserted and pop the top if matches and dont
		// push that element

		Stack s = new Stack();

		for (char c : S.toCharArray()) {
			if (!s.isEmpty() && (char) s.peek() == c) {
				s.pop();
				continue;
			}
			s.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while (!s.isEmpty()) {
			sb.insert(0, s.pop());
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		RemoveAllAdjacentDuplicatesInString_1047 rad = new RemoveAllAdjacentDuplicatesInString_1047();
		System.out.println(rad.removeDuplicates("abbaca"));

	}

}
