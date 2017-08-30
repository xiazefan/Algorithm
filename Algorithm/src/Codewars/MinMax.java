package Codewars;

import java.util.Arrays;

public class MinMax {

	public static int[] minMax(int[] arr) {
		// Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int result[] = { arr[0], arr[arr.length - 1] };
		System.out.println(Arrays.toString(result));
		return arr;
	}

	public static void main(String[] args) {
		MinMax mm = new MinMax();
		// int[] a = { 1, 2, 3, 4, 5 };
		// int[] a = { 2334454, 5 };
		int[] a = { 1 };
		mm.minMax(a);
	}

}
