package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		// int[] a = null;
		// boolean flag = false;
		// for (int i = 0; i < nums.length; i++) {
		// if (flag != true) {
		// for (int j = i + 1; j <= nums.length - 1; j++) {
		// if ((nums[i] + nums[j]) == target) {
		// int[] b = { i, j };
		// a = b;
		// flag = true;
		// break;
		// }
		// }
		// } else {
		// break;
		// }
		// }
		// return a;

		// eg from Internet
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int sums[] = { 3, 2, 4 };
		System.out.println(Arrays.toString(ts.twoSum(sums, 6)));
	}
}