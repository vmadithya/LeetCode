/**
 * 
 */
package pkg.problems.easy;

import java.util.HashSet;

/**
 * 
 * 		   You're given strings J representing the types of stones
 *         that are jewels, and S representing the stones you have. Each
 *         character in S is a type of stone you have. You want to know how many
 *         of the stones you have are also jewels.
 * 
 *         The letters in J are guaranteed distinct, and all characters in J and
 *         S are letters. Letters are case sensitive, so "a" is considered a
 *         different type of stone from "A".
 * 
 *         Example 1:
 * 
 *         Input: J = "aA", S = "aAAbbbb" Output: 3 
 *         
 *         Example 2:
 * 
 *         Input: J = "z", S = "ZZ" Output: 0 Note:
 * 
 *         S and J will consist of letters and have length at most 50. The
 *         characters in J are distinct.
 * 
 */
public class JewelsAndStones_771 {

	/**
	 * @param args
	 */
	
	//Brute force solution!
	public int  numJewelsInStones(String jewel, String stones) {
		int count = 0;
		for (char s : stones.toCharArray()) {
			for (char j : jewel.toCharArray()) {
				if (s == j)
					count++;
			}
		}
		System.out.println("Inputs: " + jewel + stones + "-->  Output Count: " + count);
		return count;
	}
	
	/***Faster solution in O(n)
	 * 
	 * class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean[] map = new boolean[256];
        for (char j : J.toCharArray()) {
            map[j] = true;
        }
        int count = 0;
        for (char s : S.toCharArray()) {
            if (map[s]) {
                count++;
            }
        }
        return count;
    }
}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA", S = "aAAbbbb";
		String J1 = "z", S1 = "ZZ";
		
	JewelsAndStones_771 jAndS = new JewelsAndStones_771();

		int res1 = jAndS.numJewelsInStones(J, S);

		int res2 = jAndS.numJewelsInStones(J1, S1);
		
		System.out.println(res1+ " <---->   " + res2);

	}

}
