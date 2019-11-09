package pkg.leetcode.problems.easy;

/*********
 * 
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B,
 * where A and B are valid parentheses strings, and + represents string
 * concatenation. For example, "", "()", "(())()", and "(()(()))" are all valid
 * parentheses strings.
 * 
 * A valid parentheses string S is primitive if it is nonempty, and there does
 * not exist a way to split it into S = A+B, with A and B nonempty valid
 * parentheses strings.
 * 
 * Given a valid parentheses string S, consider its primitive decomposition: S =
 * P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 * 
 * Return S after removing the outermost parentheses of every primitive string
 * in the primitive decomposition of S.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: "(()())(())" Output: "()()()" Explanation: The input string is
 * "(()())(())", with primitive decomposition "(()())" + "(())". After removing
 * outer parentheses of each part, this is "()()" + "()" = "()()()". Example 2:
 * 
 * Input: "(()())(())(()(()))" Output: "()()()()(())" Explanation: The input
 * string is "(()())(())(()(()))", with primitive decomposition "(()())" +
 * "(())" + "(()(()))". After removing outer parentheses of each part, this is
 * "()()" + "()" + "()(())" = "()()()()(())". Example 3:
 * 
 * Input: "()()" Output: "" Explanation: The input string is "()()", with
 * primitive decomposition "()" + "()". After removing outer parentheses of each
 * part, this is "" + "" = "".
 * 
 * 
 * Note:
 * 
 * S.length <= 10000 S[i] is "(" or ")" S is a valid parentheses string
 *
 */

public class RemoveOuterParentheses_1021 {

	public String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		int startFlag = 0;
		int paraCount = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(' && startFlag == 0) {
				startFlag = 1;
				continue;
			}
			if (S.charAt(i) == ')' && paraCount == 0) {
				startFlag = 0;
				continue;
			}
			if (S.charAt(i) == '(') {
				sb.append(S.charAt(i));
				paraCount++;

			}
			if (S.charAt(i) == ')') {
				sb.append(S.charAt(i));
				paraCount--;
			}

		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String s1="(()())(())";
		String s2="(()())(())(()(()))";
		String s3="()()";
		RemoveOuterParentheses_1021 rop = new RemoveOuterParentheses_1021();
		System.out.println(rop.removeOuterParentheses(s1));
		System.out.println(rop.removeOuterParentheses(s2));
		System.out.println(rop.removeOuterParentheses(s3));

	}

}
