package Algs4;

import java.util.Arrays;

public class Insertion {
	public static int[] sort(int[] a) {
		int N = a.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
				int temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
			}
		}
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 6, 9, 7, 5, 4, };
		// int[] a = { 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(sort(a)));
	}

}
