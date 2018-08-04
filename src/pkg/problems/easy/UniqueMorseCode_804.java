/**
 * 
 */
package pkg.problems.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * International Morse Code defines a standard encoding where each letter is
 * mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps
 * to "-...", "c" maps to "-.-.", and so on.
 * 
 * For convenience, the full table for the 26 letters of the English alphabet is
 * given below:
 * 
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Now, given a list of words, each word can be written as a concatenation of
 * the Morse code of each letter. For example, "cab" can be written as
 * "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call
 * such a concatenation, the transformation of a word.
 * 
 * Return the number of different transformations among all words we have.
 * 
 * Example: Input: words = ["gin", "zen", "gig", "msg"] Output: 2 Explanation:
 * The transformation of each word is: "gin" -> "--...-." "zen" -> "--...-."
 * "gig" -> "--...--." "msg" -> "--...--."
 * 
 * There are 2 different transformations, "--...-." and "--...--.".
 * 
 * 
 * Note:
 * 
 * The length of words will be at most 100. Each words[i] will have length in
 * range [1, 12]. words[i] will only consist of lowercase letters.
 *
 */
public class UniqueMorseCode_804 {
	
	public int uniqueMorseRepresentations(String[] words) {
		int len = 0;
		String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] codedArray = new String[100];
		int i = 0;
		for (String tempCode : words) {
			StringBuilder sb = new StringBuilder("");
			for (char c : tempCode.toCharArray()) {
				sb.append(morseCode[((int) c - 97)]);
			}
			codedArray[i] = sb.toString();
			i++;
		}

		Set<String> res = new LinkedHashSet<String>(Arrays.asList(codedArray));
		String[] resultArr = res.toArray(new String[res.size()]);
		
		for (String s : resultArr) { if (s != null) len++; }
		
		return len;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UniqueMorseCode_804 umc = new UniqueMorseCode_804();

		String[] words = {"tmwsslt","oabhx","mysiuu","hayri","hwpb","hpqs","kswj","nniatj","csttj","tlsj","csittt","nbvm","tleso","khum","chj","ciij","chj","khum","chj","chj","cham","tlsj","chj","csej","chj","ksso","ndho","ndho","qmvmg","qzjg","qzjg","aiojl","lojl","sttuq","vxq","euxq","vxq","vxq","vxq","vdoa","smuq","vxq","djqgi","bmmkgi","jkcu","atqcu","jyav","xnvy","xnsqt","xdunm","npipm","dzuy","xduy","xdimat","nwrmwx","xcqtx","tbaovi","zutzed","skzb","vwxs","vjib","zdkf","glcr","gafnr","ksnw","cuew","cfw","cuim","tasnw","tlrw","cfw","cfw","nbdm","kefw","cfw","hhsr","issif","hssin","shhr","ihhf","mnfaj","ovuj","bpdn","nvkf","qyxv","gqgav","kxmmi","yuod","ktejz","tpjz","yumz","tpjtd","tbaovi","zutzed","smdba","vzdu","vgrv","ekgpwx","aagpju","zpqd"};//{ "gin", "zen", "gig", "msg" };

		int Res = umc.uniqueMorseRepresentations(words);

		System.out.println(Res);

	}

}
