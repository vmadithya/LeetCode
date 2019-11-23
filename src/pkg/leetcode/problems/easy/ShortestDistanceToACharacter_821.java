/**
 * 
 */
package pkg.leetcode.problems.easy;

/**
 * Given a string S and a character C, return an array of integers representing
 * the shortest distance from the character C in the string.
 * 
 * Example 1:
 * 
 * Input: S = "loveleetcode", C = 'e' Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1,
 * 0]
 * 
 * 
 * Note:
 * 
 * S string length is in [1, 10000]. C is a single character, and guaranteed to
 * be in string S. All letters in S and C are lowercase.
 *
 */
public class ShortestDistanceToACharacter_821 {

	public int[] shortestToChar(String S, char C) {
		int[] result = new int[S.length()];
		int leftLen = Integer.MAX_VALUE, rightLen = Integer.MAX_VALUE;
		for (int i = 0; i < S.length(); i++) {
			if (C == S.charAt(i)) {
				result[i] = 0;
				continue;
			}
			leftLen = (S.lastIndexOf(C, i) == -1) ? Integer.MAX_VALUE : i - S.lastIndexOf(C, i);
			rightLen = (S.indexOf(C, i) - i) < 0 ? Integer.MAX_VALUE : S.indexOf(C, i) - i;
			result[i] = (leftLen < rightLen) ? leftLen : rightLen;
		}

		return result;
	}

	public static void main(String[] args) {
		ShortestDistanceToACharacter_821 sdc = new ShortestDistanceToACharacter_821();
		System.out.println(sdc.shortestToChar("loveleetcode", 'e'));
	}

}
