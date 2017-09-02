package Algs4;

import java.util.Arrays;

public class MergeBUTest {

	private static int[] aux;

	public static int[] sort(int[] a) {
		int N = a.length;
		aux = new int[N];
		for (int sz = 1; sz < N; sz = sz + sz) {
			for (int lo = 0; lo < N - sz; lo += sz + sz)
				merge.merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
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
