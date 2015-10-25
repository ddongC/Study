package data.structure.test;

import data.structure.MyStack;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack ms = new MyStack(100);
		ms.push(1);
		ms.push(2);
		ms.push(3);
		
		System.out.println(ms.peek());
		System.out.println(ms.pop());
		System.out.println(ms.peek());

		ms.push(4);
		System.out.println(ms.peek());
	}
}
