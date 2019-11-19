package pkg.leetcode.problems.easy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*****
 * 
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all
 * elements in arr2 are also in arr1.
 * 
 * Sort the elements of arr1 such that the relative ordering of items in arr1
 * are the same as in arr2. Elements that don't appear in arr2 should be placed
 * at the end of arr1 in ascending order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6] Output:
 * [2,2,2,1,4,3,3,9,6,7,19]
 * 
 * 
 * Constraints:
 * 
 * arr1.length, arr2.length <= 1000 0 <= arr1[i], arr2[i] <= 1000 Each arr2[i]
 * is distinct. Each arr2[i] is in arr1.
 *
 */

public class RelativeSortArray_1122 {

	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		LinkedHashMap<Integer, Integer> arr1Lhm = new LinkedHashMap<Integer, Integer>();
		LinkedHashMap<Integer, Integer> arr2Lhm = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < arr2.length; i++) {
			if (arr2Lhm.containsKey(arr2[i])) {
				arr2Lhm.put(arr2[i], arr2Lhm.get(arr2[i]) + 1);
			} else {
				arr2Lhm.put(arr2[i], 1);
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1Lhm.containsKey(arr1[i])) {
				arr1Lhm.put(arr1[i], arr1Lhm.get(arr1[i]) + 1);
			} else {
				arr1Lhm.put(arr1[i], 1);
			}
		}

		int[] result = arr1;
		int resIdx = 0;
		// traverse arr2Lhm in order, find the count of arr1 if contains and then add
		// that many elements in the array

		for (Map.Entry mapElement : arr2Lhm.entrySet()) {
			Integer key = (Integer) mapElement.getKey();
			int value = ((int) mapElement.getValue());

			if (arr1Lhm.containsKey(key)) {
				int arr1Value = arr1Lhm.get(key);
				for (int i = 0; i < arr1Value; i++) {
					result[resIdx++] = key;
				}

			}
		}

		// traverse arr1Lhm in order, if not present in arr2Lhm then add it in the end
		// of the array
		int[] tmpRes = new int[result.length - resIdx];
		int tmpIdx = 0;
		for (Map.Entry mapElement : arr1Lhm.entrySet()) {
			Integer key = (Integer) mapElement.getKey();
			if (!arr2Lhm.containsKey(key)) {
				int value = ((int) mapElement.getValue());
				for (int i = 0; i < value; i++) {
					tmpRes[tmpIdx++] = key;
				}
			}
		}
		Arrays.sort(tmpRes);
		for (int i = 0; i < tmpRes.length; i++)
			result[resIdx++] = tmpRes[i];

		return result;

	}

	public static void main(String[] args) {
		RelativeSortArray_1122 rsa = new RelativeSortArray_1122();
		System.out.println(rsa.relativeSortArray(new int[] { 2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31 }, new int[] { 2,42,38,0,43,21}));
		System.out.println(rsa.relativeSortArray(new int[] { 28, 6, 22, 8, 44, 17 }, new int[] { 22, 28, 8, 6 }));
		System.out.println(
				rsa.relativeSortArray(new int[] { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, new int[] { 2, 1, 4, 3, 9, 6 }));
	}

}
