package Algs4;

import java.util.Arrays;

public class Stack {

	public static void sort(int[] pq) {
		int n = pq.length;
		for (int k = n / 2; k >= 1; k--)
			sink(pq, k, n);
		while (n > 1) {
			exch(pq, 1, n--);
			sink(pq, 1, n);
		}
	}

	private static void sink(int[] pq, int k, int n) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && less(pq, j, j + 1))
				j++;
			if (!less(pq, k, j))
				break;
			exch(pq, k, j);
			k = j;
		}
	}

	private static boolean less(int[] pq, int i, int j) {
		return pq[i - 1] < (pq[j - 1]);
	}

	private static void exch(int[] pq, int i, int j) {
		int swap = pq[i - 1];
		pq[i - 1] = pq[j - 1];
		pq[j - 1] = swap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 9, 4, 6, 7, 5, 3, 2, 1, 8 };
		Stack.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
