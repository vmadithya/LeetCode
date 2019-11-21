package pkg.problems.easy;

/**
 * 
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1:
 * 
 * Input: "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will
 * not be any extra space in the string.
 *
 */

public class ReverseWordsInAStringIII_557 {

	public String reverseWords(String input) {
		final StringBuilder result = new StringBuilder();
		final StringBuilder word = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				word.append(input.charAt(i));
			} else {
				result.append(word.reverse());
				result.append(" ");
				word.setLength(0);
			}
		}
		result.append(word.reverse());
		return result.toString();
	}

	public static void main(String[] args) {
		ReverseWordsInAStringIII_557 rwis = new ReverseWordsInAStringIII_557();
		System.out.println(rwis.reverseWords("Let's take LeetCode contest"));
	}

}
