package pkg.leetcode.problems.easy;

import java.util.HashMap;

/****
 * 
 * You are given an array of strings words and a string chars.
 * 
 * A string is good if it can be formed by characters from chars (each character
 * can only be used once).
 * 
 * Return the sum of lengths of all good strings in words.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: words = ["cat","bt","hat","tree"], chars = "atach" Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer
 * is 3 + 3 = 6. Example 2:
 * 
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr" Output:
 * 10 Explanation: The strings that can be formed are "hello" and "world" so the
 * answer is 5 + 5 = 10.
 * 
 * 
 * Note:
 * 
 * 1 <= words.length <= 1000 1 <= words[i].length, chars.length <= 100 All
 * strings contain lowercase English letters only.
 *
 */

public class FindWordsThatCanBeFormedByCharacters_1160 {
	public int countCharacters(String[] words, String chars) {

		HashMap<Character, Integer> chrs = new HashMap<Character, Integer>();
		int result = 0;
		// initialize chars hashmap
		for (int i = 0; i < chars.length(); i++) {
			if (chrs.containsKey(chars.charAt(i))) {
				chrs.put(chars.charAt(i), chrs.get(chars.charAt(i)) + 1);
			} else {
				chrs.put(chars.charAt(i), 1);
			}
		}

		for (String word : words) {
			HashMap<Character, Integer> wrds = new HashMap<Character, Integer>();
			boolean flg = false;
			for (int i = 0; i < word.length(); i++) {

				if (wrds.containsKey(word.charAt(i))) {
					wrds.put(word.charAt(i), wrds.get(word.charAt(i)) + 1);
				} else {
					wrds.put(word.charAt(i), 1);
				}
			}
			for (Character c : wrds.keySet()) {
				if (!chrs.containsKey(c)) {
					wrds.clear();
					flg = false;
					break;
				}
				if ((chrs.containsKey(c) && (chrs.get(c) < wrds.get(c)))) {
					wrds.clear();
					flg = false;
					break;
				}
				flg = true;
			}
			if (flg)
				result = result + word.length();
		}
		return result;

	}

	public static void main(String[] args) {
		FindWordsThatCanBeFormedByCharacters_1160 fwc = new FindWordsThatCanBeFormedByCharacters_1160();
		System.out.println(fwc.countCharacters(
				new String[] { "skwgxuuuumkfurejmqrbipvlavdrozjyxhagbwetabjwevfsegqfpllgafm", "ufvpzzgpswnk",
						"tcouxmlrnfyoxvkeglchhryykmdvgvdxpookbtiyhuthoqsnqbowewpfgbcy",
						"qwpttmxzazkkfqqtrnkaejifligdvgnyvtmppjbkeuqryxzqyegttvhzolpztvigxygzvsppurijaekb",
						"vbtvbheurzbglzljczmziitkbmtoybiwhoyfrsxvfveaxchebjdzdnnispzwbrgrbcdaistps" },
				"avyteswqppomeojxoybotzriuvxolmllevluauwb"));
		System.out.println(fwc.countCharacters(new String[] { "cat", "bt", "hat", "tree" }, "atach"));
		System.out.println(fwc.countCharacters(new String[] { "hello", "world", "leetcode" }, "welldonehoneyr"));

	}

}
