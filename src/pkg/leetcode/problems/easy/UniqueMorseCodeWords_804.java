package pkg.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

/********
 * 
 * International Morse Code defines a standard encoding where each letter is
 * mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps
 * to "-...", "c" maps to "-.-.", and so on.
 * 
 * For convenience, the full table for the 26 letters of the English alphabet is
 * given below:
 * 
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Now, given a list of words, each word can be written as a concatenation of
 * the Morse code of each letter. For example, "cba" can be written as
 * "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call
 * such a concatenation, the transformation of a word.
 * 
 * Return the number of different transformations among all words we have.
 * 
 * Example: Input: words = ["gin", "zen", "gig", "msg"] Output: 2 Explanation:
 * The transformation of each word is: "gin" -> "--...-." "zen" -> "--...-."
 * "gig" -> "--...--." "msg" -> "--...--."
 * 
 * There are 2 different transformations, "--...-." and "--...--.". Note:
 * 
 * The length of words will be at most 100. Each words[i] will have length in
 * range [1, 12]. words[i] will only consist of lowercase letters.
 *
 */

public class UniqueMorseCodeWords_804 {

	public int uniqueMorseRepresentations(String[] words) {
		
		String [] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		Set<String> s = new HashSet<String>();
		
		
		//get the morse code for each words in the string array
		for (String word : words) {
			StringBuilder sb = new StringBuilder();
			for (char c: word.toCharArray()) {
				sb.append(morseCode[c-'a']);
			}
			//put this into a hashSet to make it unique
			s.add(sb.toString());
		}
		return s.size();
		

	}

	public static void main(String[] args) {
		String[] words = {"gin", "zen", "gig", "msg"};
		UniqueMorseCodeWords_804 umc = new UniqueMorseCodeWords_804();
		System.out.println(umc.uniqueMorseRepresentations(words));

	}

}
