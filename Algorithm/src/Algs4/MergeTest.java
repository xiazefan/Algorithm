package Algs4;

import java.util.Arrays;

public class MergeTest {

	private static int[] aux;

	public static void sort(int[] a) {
		aux = new int[a.length];
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		merge.merge(a, lo, mid, hi);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 6, 9, 7, 5, 4, };
		// int[] a = { 6, 5, 4, 3, 2, 1 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
