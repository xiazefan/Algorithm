package Algs4;
import java.util.Arrays;

public class BinarySearch {

	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 10, 11, 12, 16, 18, 23, 29, 33, 48, 54, 57, 68, 77, 84, 98 };
		Arrays.sort(a);
		System.out.println(rank(18, a));
	}

}
