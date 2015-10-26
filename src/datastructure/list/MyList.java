package datastructure.list;

public class MyList {
	private ListNode head;
	private int size;

	public MyList() {
		this.head = new ListNode(null);
		this.size = 0;
	}

	public int getSize() {
		return size;
	}

	public void add(Object obj) {
		ListNode next = new ListNode(obj);
		next.setNext(head.getNext());
		head.setNext(next);

		size++;
	}

	public int getIndex(Object obj) {
		int index = 0, count = 0;
		ListNode search = head.getNext();

		while (search != null) {
			if (search.getData().equals(obj)) {
				break;
			}
			count++;
			search = search.getNext();
		}

		index = (count > 0) ? count : -1;

		return index;
	}

	public void printAllNode() {
		ListNode print = head.getNext();

		while (print != null) {
			System.out.print(print.getData() + " ");
			print = print.getNext();
		}
		System.out.println();
	}
}
