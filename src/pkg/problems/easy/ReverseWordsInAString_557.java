/**
 * 
 */
package pkg.problems.easy;

/**
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1: Input: "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL
 * tsetnoc" Note: In the string, each word is separated by single space and
 * there will not be any extra space in the string.
 *
 */
public class ReverseWordsInAString_557 {

	public String reverseString(String s) {
		StringBuilder sb1 = new StringBuilder("");
		char[] cArr = s.toCharArray();
		for (int i = cArr.length - 1; i >= 0; i--) {
			sb1.append(cArr[i]);
		}
		return sb1.toString();
	}

	public String reverseWords(String s) {
		String[] splitArr = s.split(" ");
		StringBuilder sb = new StringBuilder("");
		for (String s1: splitArr) {
			sb.append(reverseString(s1)).append(" ");
		}
		
		return sb.toString().substring(0,sb.length()-1);

	}

	public static void main(String[] args) {
		ReverseWordsInAString_557 rws = new ReverseWordsInAString_557();
		System.out.println(rws.reverseWords("Let's take LeetCode contest"));
	}

}
