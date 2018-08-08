/**
 * 
 */
package pkg.problems.easy;

/**
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * Example: Given s = "hello", return "olleh".
 *
 */
public class ReverseString_344 {

	public String reverseString(String s) {
		StringBuilder sb1 = new StringBuilder("");
		char[] cArr = s.toCharArray();
		for (int i = cArr.length-1; i >= 0  ; i--) {
			sb1.append(cArr[i]);
		}
		return sb1.toString();
	}

	public static void main(String[] args) {
		ReverseString_344 rS = new ReverseString_344();
		
		System.out.println(rS.reverseString("hello"));

	}

}
