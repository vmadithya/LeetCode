package pkg.problems.cleancode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number. The function twoSum should return indices of the two
 * numbers such that they add up to the target, where index1 must be less than
 * index2. Please note that your returned answers (both index1 and index2) are
 * not zero-based. You may assume that each input would have exactly one
 * solution.
 *
 */
public class TwoSumThree {


	private Map<Integer, Integer> table = new HashMap<>();

	public void add(int input) {
		int count = table.containsKey(input) ? table.get(input) : 0;
		table.put(input, count + 1);
	}

	public boolean find(int val) {
		for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
			int num = entry.getKey();
			int y = val - num;
			if (y == num) { // For duplicates, ensure there are at least two individual numbers.
				if (entry.getValue() >= 2)
					return true;
			} else if (table.containsKey(y)) {
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		TwoSumThree ts = new TwoSumThree();
		ts.add(3);
		ts.add(11);
		ts.add(12);
		ts.add(22);
		ts.add(31);
		ts.add(32);
		
		System.out.println(ts.find(13));
		
	}

}