package datastructure;

public class MyStack {
	private int[] stack;
	private int maxStackSize;
	private int top;

	public MyStack(int maxStackSize) {
		this.maxStackSize = maxStackSize;
		this.stack = new int[maxStackSize];
		this.top = -1;
	}

	public boolean isFull() {
		return (top == maxStackSize - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public void push(int item) {
		if (isFull()) {
			System.err.println("The stack is full!");
			System.exit(-1);
		}
		++top;
		stack[top] = item;
	}

	public int pop() {
		if (isEmpty()) {
			System.err.println("The stack is empty!");
			System.exit(-2);
		}

		return stack[top--];
	}

	public int peek() {
		if (isEmpty()) {
			System.err.println("The stack is empty!");
			System.exit(-2);
		}

		return stack[top];
	}

}
