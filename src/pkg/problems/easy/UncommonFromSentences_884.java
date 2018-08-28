package pkg.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */

/**
 * We are given two sentences A and B. (A sentence is a string of space
 * separated words. Each word consists only of lowercase letters.)
 * 
 * A word is uncommon if it appears exactly once in one of the sentences, and
 * does not appear in the other sentence.
 * 
 * Return a list of all uncommon words.
 * 
 * You may return the list in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: A = "this apple is sweet", B = "this apple is sour" Output:
 * ["sweet","sour"] Example 2:
 * 
 * Input: A = "apple apple", B = "banana" Output: ["banana"]
 *
 */
public class UncommonFromSentences_884 {

	public String[] uncommonFromSentences(String A, String B) {
		String[] result = new String[200];
		ArrayList<String> al = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String st : A.concat(" ").concat(B).split("\\s")) {
			if (hm.containsKey(st) && hm.get(st) > 0) {
				hm.put(st, hm.get(st)+1);
			} else {
				hm.put(st, 1);
			}
		}
		int j = 0;
		for (String s : hm.keySet()) {
			if (hm.get(s) == 1) {
				al.add(s);
				result[j++] = s;
			}
		}
		String[] bar = al.toArray(new String[al.size()]);
		
		return bar;
	}

	public static void main(String[] args) {
		UncommonFromSentences_884 ufs = new UncommonFromSentences_884();

		String[] finalid = ufs.uncommonFromSentences("s z z z s" , "s z ejt");
		
		for (String s: finalid) {
			System.out.println(s + "   ");
		}

	}

}
