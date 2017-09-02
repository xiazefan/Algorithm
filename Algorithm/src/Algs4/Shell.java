package Algs4;

import java.util.Arrays;

public class Shell {

	public static int[] sort(int[] a) {
		int j = 0;
		int temp = 0;
		for (int increment = a.length / 2; increment > 0; increment /= 2) {
			System.out.println("increment:" + increment);
			for (int i = increment; i < a.length; i++) {
				temp = a[i];
				for (j = i - increment; j >= 0; j -= increment) {
					if (temp < a[j]) {
						a[j + increment] = a[j];
					} else {
						break;
					}
				}
				a[j + increment] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a = { 3, 6, 9, 7, 5, 4 };
		int[] a = { 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(sort(a)));
	}

}
