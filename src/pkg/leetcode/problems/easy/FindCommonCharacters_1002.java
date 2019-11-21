package pkg.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*****
 * 
 * Given an array A of strings made only from lowercase letters, return a list
 * of all characters that show up in all strings within the list (including
 * duplicates). For example, if a character occurs 3 times in all strings but
 * not 4 times, you need to include that character three times in the final
 * answer.
 * 
 * You may return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: ["bella","label","roller"] Output: ["e","l","l"] Example 2:
 * 
 * Input: ["cool","lock","cook"] Output: ["c","o"]
 * 
 * 
 * Note:
 * 
 * 1 <= A.length <= 100 1 <= A[i].length <= 100 A[i][j] is a lowercase letter
 *
 */

public class FindCommonCharacters_1002 {

	public List<String> commonChars(String[] A) {
		int[] min = new int[26];
		Arrays.fill(min, Integer.MAX_VALUE);
		List<String> solution = new ArrayList<String>();
		for (String word : A) {
			int curr[] = new int[26];
			for (char c : word.toCharArray())
				curr[c - 'a']++;
			for (int i = 0; i < 26; i++)
				min[i] = Math.min(min[i], curr[i]);
		}
		for (int i = 0; i < 26; i++)
			while (min[i]-- > 0)
				solution.add((char) (i + 'a') + "");
		return solution;
	}

	public List<String> commonCharsToMakeItWork(String[] A) {
		StringBuilder tmp1 = new StringBuilder();
		StringBuilder tmp2 = new StringBuilder();
		List<String> res = new ArrayList<String>();
		if (A.length == 1)
			return Arrays.asList(A);
		StringBuilder commonString = new StringBuilder();
		for (int i = 0; i < A.length - 1; i++) {
			if (i == 0)
				tmp1.append(A[i]);
			tmp2.append(A[i + 1]);

			for (int innerI = 0; innerI < tmp1.length(); innerI++) {
				for (int innerJ = 0; innerJ < tmp2.length(); innerJ++) {
					if (tmp1.charAt(innerI) == tmp2.charAt(innerJ)) {
						commonString.append(tmp1.charAt(innerI));
						tmp1.setCharAt(innerI, '@');
						tmp2.setCharAt(innerJ, '#');
					}
				}
				tmp1.setLength(0);
				tmp1 = commonString;
				commonString.setLength(0);
			}

			if (i == A.length - 1 && tmp1.length() > 0) {
				for (int k = 0; k < tmp1.length(); k++) {
					res.add(tmp1.charAt(k) + "");
				}
			}

		}

		return res;

	}

	public static void main(String[] args) {
		FindCommonCharacters_1002 fcc = new FindCommonCharacters_1002();
		System.out.println(fcc.commonChars(new String[] { "bella", "label", "roller" }));
		System.out.println(fcc.commonChars(new String[] { "cool", "lock", "cook" }));

	}

}
