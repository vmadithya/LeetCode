/**
 * 
 */
package pkg.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A website domain like "discuss.leetcode.com" consists of various subdomains.
 * At the top level, we have "com", at the next level, we have "leetcode.com",
 * and at the lowest level, "discuss.leetcode.com". When we visit a domain like
 * "discuss.leetcode.com", we will also visit the parent domains "leetcode.com"
 * and "com" implicitly.
 * 
 * Now, call a "count-paired domain" to be a count (representing the number of
 * visits this domain received), followed by a space, followed by the address.
 * An example of a count-paired domain might be "9001 discuss.leetcode.com".
 * 
 * We are given a list cpdomains of count-paired domains. We would like a list
 * of count-paired domains, (in the same format as the input, and in any order),
 * that explicitly counts the number of visits to each subdomain.
 * 
 * Example 1: Input: ["9001 discuss.leetcode.com"] Output: ["9001
 * discuss.leetcode.com", "9001 leetcode.com", "9001 com"] Explanation: We only
 * have one website domain: "discuss.leetcode.com". As discussed above, the
 * subdomain "leetcode.com" and "com" will also be visited. So they will all be
 * visited 9001 times.
 * 
 * Example 2: Input: ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com",
 * "5 wiki.org"] Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5
 * wiki.org","5 org","1 intel.mail.com","951 com"] Explanation: We will visit
 * "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and
 * "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 =
 * 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
 * 
 * Notes:
 * 
 * The length of cpdomains will not exceed 100. The length of each domain name
 * will not exceed 100. Each address will have either 1 or 2 "." characters. The
 * input count in any count-paired domain will not exceed 10000. The answer
 * output can be returned in any order.
 *
 */
public class SubDomainVisitCount_811 {

	
	public List<String> subdomainVisits(String[] cpdomains) {
		List<String> result = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String s : cpdomains) {
			// 800 discuss.google.com
			String[] splitArry = s.split(" ");
			// splitArry[0] = 800 splitSubArry[0] = discuss, splitSubArry[1] = google,
			// splitSubArry[2] = com
			String[] splitSubArry = splitArry[1].toString().split("\\.");
			StringBuilder sb = new StringBuilder("");
			for (int t = splitSubArry.length-1; t >= 0 ; t--) {
				sb.append(splitSubArry[t]);
				if (hm.get(sb.toString()) == null) {
					hm.put(sb.toString(), Integer.parseInt(splitArry[0]));
				} else {
					hm.put(sb.toString(), hm.get(sb.toString()) + Integer.parseInt(splitArry[0]));
				}
				sb.append(".");
			}

		}
		for (String ks : hm.keySet()) {
			String[] s = ks.split("\\.");
			StringBuilder sb1 = new StringBuilder("");
			for (int i = s.length-1; i >= 0  ; i--) {
				sb1.append(s[i]).append(".");
			}
			result.add(hm.get(ks)+ " "+ sb1.toString().substring(0,sb1.toString().length()-1));
		}
		//result.add(hm.toString());
		return result;

	}

	/*
	 * public List<String> subdomainVisits1(String[] cpdomains) { List<String>
	 * result = new ArrayList<String>(); HashMap<String, Integer> hm = new
	 * HashMap<String, Integer>();
	 * 
	 * for(String s: cpdomains) { //800 discuss.google.com String [] splitArry =
	 * s.split(" "); if(hm.get(splitArry[1]) != null) { hm.put(splitArry[1],
	 * hm.get(splitArry[1])+ Integer.parseInt(splitArry[0])); } else {
	 * hm.put(splitArry[1], Integer.parseInt(splitArry[0])); }
	 * 
	 * } result.add(hm.values().toString()); return result;
	 * 
	 * }
	 */
	public static void main(String[] args) {
		SubDomainVisitCount_811 sdv = new SubDomainVisitCount_811();

		String[] input = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };

		System.out.println(sdv.subdomainVisits(input));
	}

}
