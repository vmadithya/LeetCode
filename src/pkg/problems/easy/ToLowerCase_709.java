
package pkg.problems.easy;

import java.util.HashMap;

/**
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

/**
 * 
 * char[] ss = str.toCharArray();
        for(int i=0;i<ss.length;i++){
            if(ss[i]>='A'&&ss[i]<='Z'){
                ss[i]+=32;
            }
        }
        return new String(ss);
 *
 */
public class ToLowerCase_709 {
	
	public String toLowerCase(String str) {
		String result = "";
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		// initialize the hashmap with lower chars
		for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
			hm.put(alphabet, (char) ((int) alphabet + 32));
		}
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			hm.put(alphabet, alphabet);
		}
		StringBuilder sb = new StringBuilder("");
		for (char c : str.toCharArray()) {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
				sb.append((hm.get(c)).toString());
			else
				sb.append(c);
		}

		return sb.toString();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToLowerCase_709 lc = new ToLowerCase_709();
		System.out.println(lc.toLowerCase("Hello"));
		System.out.println(lc.toLowerCase("hello")); 
		System.out.println(lc.toLowerCase("LOVELY"));
		System.out.println(lc.toLowerCase("al&PphaBET"));

	}

}
