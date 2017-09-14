package LeetCode;

public class AddTwoNumbers {

	public static ListNode buildListNode(int[] input) {
		ListNode first = null, last = null, newNode;
		if (input.length > 0) {
			for (int i = 0; i < input.length; i++) {
				newNode = new ListNode(input[i]);
				newNode.next = null;
				if (first == null) {
					first = newNode;
					last = newNode;
				} else {
					last.next = newNode;
					last = newNode;
				}
			}
		}
		return first;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode a = new ListNode(0);
		ListNode result = a;
		int sum = 0;

		while (l1 != null || l2 != null) {
			sum = sum / 10;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			result.next = new ListNode(sum % 10);
			result = result.next;
		}

		if (sum / 10 == 1)
			result.next = new ListNode(1);
		return a.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers atn = new AddTwoNumbers();
		int[] intput1 = new int[] { 2, 4, 3 };
		int[] intput2 = new int[] { 5, 6, 4 };
		// int[] intput1 = new int[] { 5 };
		// int[] intput2 = new int[] { 5 };
		ListNode l1 = atn.buildListNode(intput1);
		ListNode l2 = atn.buildListNode(intput2);
		ListNode result = atn.addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.print(result.val + "->");
			result = result.next;
		}
	}

}
