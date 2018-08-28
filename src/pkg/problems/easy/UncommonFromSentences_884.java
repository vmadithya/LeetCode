package pkg.problems.easy;
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
        String[] result = {""};
        HashSet<String> hs = new HashSet<>();
        
        for (String st : A.concat(B).split("\\s")) {
        	hs.add(st);
        }
        Iterator<String> i = hs.iterator();
        int j = 0;
        while (i.hasNext()) {
        	result[j] = i.next();
        	System.out.println(result[j]);
        	j++;
        	
        }
            
        
        return result;
    }
	public static void main(String[] args) {
		UncommonFromSentences_884 ufs = new UncommonFromSentences_884();
		
		String [] finalid = ufs.uncommonFromSentences("apple apple", "banana");

	}

}
