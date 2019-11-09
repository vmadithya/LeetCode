package pkg.leetcode.problems.easy;

import java.util.HashMap;

/****
 * 
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have. Each character in S is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type of
 * stone from "A".
 * 
 * Example 1:
 * 
 * Input: J = "aA", S = "aAAbbbb" Output: 3 Example 2:
 * 
 * Input: J = "z", S = "ZZ" Output: 0 Note:
 * 
 * S and J will consist of letters and have length at most 50. The characters in
 * J are distinct.
 ****/

public class JewelsAndStone_771 {

	public int numJewelsInStones(String J, String S) {

		// put jewels into a hashMap with value as 0
		HashMap<Character, Integer> jewels = new HashMap();
		for (int i = 0; i < J.length(); i++) {
			jewels.put(J.charAt(i), 0);
		}
		// scan the stones as array , if key found then increase the count
		for (int i = 0; i < S.length(); i++) {
			if (jewels.containsKey(S.charAt(i))) {
				jewels.put(S.charAt(i), jewels.get(S.charAt(i)) + 1);
			}
		}
		int result = 0;
		// for all keys add the value and return
		for (Character c : jewels.keySet()) {
			result = result + jewels.get(c);
		}
		return result;

	}

	public static void main(String[] args) {
		JewelsAndStone_771 js = new JewelsAndStone_771();
		String J = "aA", S = "aAAbbbb", J1 = "z", S1 = "ZZ";
		System.out.println(js.numJewelsInStones(J, S));
		System.out.println(js.numJewelsInStones(J1, S1));
	}

}
