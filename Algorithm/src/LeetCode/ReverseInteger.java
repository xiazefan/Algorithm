package LeetCode;

public class ReverseInteger {

	public int reverse(int x) {

		String getInt = String.valueOf(x);
		String[] c = getInt.split("");

		StringBuffer result = new StringBuffer();
		try {
			if (c[0].equals("-")) {
				result.append(c[0].toString());
				for (int j = c.length - 1; j > 0; j--) {
					result.append(c[j]);
				}
			} else {
				for (int j = c.length - 1; j >= 0; j--) {
					result.append(c[j]);
				}
			}

			int finalResult = Integer.parseInt(result.toString());
			return finalResult;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(123));
		System.out.println(ri.reverse(-123));
		System.out.println(ri.reverse(2147483647));
	}
}
