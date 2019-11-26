/**
 * 
 */
package pkg.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given words first and second, consider occurrences in some text of the form
 * "first second third", where second comes immediately after first, and third
 * comes immediately after second.
 * 
 * For each such occurrence, add "third" to the answer, and return the answer.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: text = "alice is a good girl she is a good student", first = "a",
 * second = "good" Output: ["girl","student"] Example 2:
 * 
 * Input: text = "we will we will rock you", first = "we", second = "will"
 * Output: ["we","rock"]
 * 
 * 
 * Note:
 * 
 * 1 <= text.length <= 1000 text consists of space separated words, where each
 * word consists of lowercase English letters. 1 <= first.length, second.length
 * <= 10 first and second consist of lowercase English letters.
 *
 */
public class OccurrencesAfterBigram_1078 {

	public String[] findOcurrences(String text, String first, String second) {

		String[] textString = text.split(" ");
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < textString.length - 2; i++) {
			if (textString[i].equals(first) && textString[i + 1].equals(second)) {
				result.add(textString[i + 2]);
			}
		}
		String[] resArray = new String[result.size()];
		return (String[]) result.toArray(resArray);
	}

	public static void main(String[] args) {
		OccurrencesAfterBigram_1078 oab = new OccurrencesAfterBigram_1078();
		System.out.println(oab.findOcurrences("we will we will rock you", "we", "will"));
	}

}
