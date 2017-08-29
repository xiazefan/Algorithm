package Codewars;

import java.util.Arrays;

public class MinMax {

	public static int[] minMax(int[] arr) {
		Arrays.sort(arr);
		int result[] = { arr[0], arr[arr.length - 1] };
		System.out.println(Arrays.toString(result));
		return arr;
	}

	public static void main(String[] args) {
		MinMax mm = new MinMax();
		int[] a = { 1, 2, 3, 4, 5 };
		mm.minMax(a);
	}

}
