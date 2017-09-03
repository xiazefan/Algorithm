package Algs4;

public class Partition {

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

}
