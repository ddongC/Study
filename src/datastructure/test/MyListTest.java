package datastructure.test;

import datastructure.MyList;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();

		list.add(1);
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(4);
		list.add(5);

		list.printAllNode();
		System.out.println("size: " + list.getSize());
	}
}
