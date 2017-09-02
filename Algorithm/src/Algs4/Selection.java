package Algs4;

import java.util.Arrays;

public class Selection {
	public static int[] sort(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}

			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a = { 3, 6, 9, 7, 5, 4, };
		int[] a = { 6, 5, 4, 3, 2, 1 };
		Long start = System.currentTimeMillis();
		System.out.println(Arrays.toString(sort(a)));
		Long now = System.currentTimeMillis();
		System.out.println("Cost Time+: " + (now - start) / 1000);
	}
}
