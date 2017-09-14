package Algs4;

public class SequentialSearch {

	private static int rank(int key, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 9, 4, 6, 7, 5, 3, 2, 1, 8 };
		System.out.println(SequentialSearch.rank(6, a));
	}
}
