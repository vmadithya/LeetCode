package pkg.leetcode.problems.easy;

/*******
 * 
 * Implement function ToLowerCase() that has a string parameter str, and returns
 * the same string in lowercase.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: "Hello" Output: "hello" Example 2:
 * 
 * Input: "here" Output: "here" Example 3:
 * 
 * Input: "LOVELY" Output: "lovely"
 *
 */

public class ToLowerCase_709 {

	public String toLowerCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (Character c : str.toCharArray()) {
			if ((int) c >= 65 & (int) c <= 90) {
				sb.append((char) ((int) c + 32));
			} else
				sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		char a = 'a';
		char A = 'A';
		char z = 'z';
		char Z = 'Z';
		int asciia = a;
		int asciiA = A;
		int asciiz = z;
		int asciiZ = Z;
		System.out.println(asciia + "------" + asciiA);
		System.out.println(asciiz + "------" + asciiZ);

		ToLowerCase_709 tl = new ToLowerCase_709();
		System.out.println(tl.toLowerCase("Hello"));
		System.out.println(tl.toLowerCase("here"));
		System.out.println(tl.toLowerCase("LOVELY"));

	}

}
