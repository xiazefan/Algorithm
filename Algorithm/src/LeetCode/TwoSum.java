package LeetCode;
import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] a = null;
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			if (flag != true) {
				for (int j = i + 1; j <= nums.length - 1; j++) {
					if ((nums[i] + nums[j]) == target) {
						int[] b = { i, j };
						a = b;
						flag = true;
						break;
					}
				}
			} else {
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int sums[] = { 3, 2, 4 };
		System.out.println(Arrays.toString(ts.twoSum(sums, 6)));
	}
}