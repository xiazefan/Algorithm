package Algs4;

import java.util.Arrays;

public class Quick {

	public static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	private static int partition(int[] a, int lo, int hi) {
		int i = lo, j = hi + 1;
		int v = a[lo];

		while (true) {
			while (a[++i] < v)
				if (i == hi)
					break;
			while (v < a[--j])
				if (j == lo)
					break;

			if (i >= j)
				break;
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		int temp = a[lo];
		a[lo] = a[j];
		a[j] = temp;

		return j;

	}

	private static void sort(int[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 6, 9, 7, 5, 4, };
		// int[] a = { 6, 5, 4, 3, 2, 1 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
