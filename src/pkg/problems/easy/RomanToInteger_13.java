/**
 * 
 */
package pkg.problems.easy;

import java.util.HashMap;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 For example, two is written
 * as II in Roman numeral, just two one's added together. Twelve is written as,
 * XII, which is simply X + II. The number twenty seven is written as XXVII,
 * which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. X can be placed
 * before L (50) and C (100) to make 40 and 90. C can be placed before D (500)
 * and M (1000) to make 400 and 900. Given a roman numeral, convert it to an
 * integer. Input is guaranteed to be within the range from 1 to 3999.
 * 
 * Example 1:
 * 
 * Input: "III" Output: 3 Example 2:
 * 
 * Input: "IV" Output: 4 Example 3:
 * 
 * Input: "IX" Output: 9 Example 4:
 * 
 * Input: "LVIII" Output: 58 Explanation: C = 100, L = 50, XXX = 30 and III = 3.
 * Example 5:
 * 
 * Input: "MCMXCIV" Output: 1994 Explanation: M = 1000, CM = 900, XC = 90 and IV
 * = 4.
 *
 */
public class RomanToInteger_13 {
	
	public int romanToInt1(String s) {
		int total = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		//LVIII
		//hm.put("IV", 4);
		//hm.put("IX", 9);
		//hm.put("XL", 40);
		//hm.put("XC", 90);
		//hm.put("CD", 400);
		//hm.put("CM", 900);
		char[] c = s.toCharArray();
		for (int i = s.length()-1; i > 0; i--) {
			int temp = i - 1;
			if (hm.get(c[i]) <= hm.get(c[temp])) {
				total += hm.get(c[i]);
			} else {
				total -= hm.get(c[i]);
			}

		}
		total += hm.get(c[0]);
		return total;
	}

	public int romanToInt(String s) {
		char[] c = s.toCharArray();
		int total = 0;
		for (int j = 0; j < s.length(); j++) {
			int tem = j + 1;

			if (j < s.length() - 1 && c[j] == 'I' && c[tem] == 'V') {
				total += 4;
				j++;
				continue;
			}
			if (j < s.length() - 1 && c[j] == 'I' && c[tem] == 'X') {
				total += 9;
				j++;
				continue;
			}
			if (j < s.length() - 1 && c[j] == 'X' && c[tem] == 'L') {
				total += 40;
				j++;
				continue;
			}
			if (j < s.length() - 1 && c[j] == 'X' && c[tem] == 'C') {
				total += 90;
				j++;
				continue;
			}
			if (j < s.length() - 1 && c[j] == 'C' && c[tem] == 'D') {
				total += 400;
				j++;
				continue;
			}
			if (j < s.length() - 1 && c[j] == 'C' && c[tem] == 'M') {
				total += 900;
				j++;
				continue;
			}
			if (c[j] == 'I') {
				total += 1;
			}
			if (c[j] == 'V') {
				total += 5;
			}
			if (c[j] == 'X') {
				total += 10;
			}
			if (c[j] == 'L') {
				total += 50;
			}
			if (c[j] == 'C') {
				total += 100;
			}
			if (c[j] == 'D') {
				total += 500;
			}
			if (c[j] == 'M') {
				total += 1000;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		RomanToInteger_13 r2I = new RomanToInteger_13();
		System.out.println(r2I.romanToInt("MCMXCIV"));
	}

}
