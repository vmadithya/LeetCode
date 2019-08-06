package pkg.problems.easy;
/***
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
 

Note:

You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class KeyBoardRow_500 {
	public String[] findWords(String[] words) {
		String[] strs = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			for (char c : strs[i].toCharArray()) {
				map.put(c, i);
			}
		}
		List<String> res = new LinkedList<>();
		for (String w : words) {
			if (w.equals(""))
				continue;
			int index = map.get(w.toUpperCase().charAt(0));
			for (char c : w.toUpperCase().toCharArray()) {
				if (map.get(c) != index) {
					index = -1; 
					break;
				}
			}
			if (index != -1)
				res.add(w);
		}
		return res.toArray(new String[0]);

	}

	public static void main(String[] args) {

		KeyBoardRow_500 kbr = new KeyBoardRow_500();
		String[] input = { "hello", "alaska", "dad", "peace" };
		System.out.println(kbr.findWords(input));

	}

}
