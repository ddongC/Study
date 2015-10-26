package datastructure.queue;

public class MyQueue {
	private QueueNode front, rear;

	public MyQueue() {
		this.front = null;
		this.rear = null;
	}

	public boolean isEmpty() {
		return (front == null);
	}

	public void enqueue(Object item) {
		QueueNode tmp = new QueueNode();

		tmp.setItem(item);
		tmp.setLink(null);

		if (isEmpty()) {
			front = tmp;
			rear = tmp;
		} else {
			rear.setLink(tmp);
			rear = tmp;
		}
	}

	public Object dequeue() {
		if (isEmpty()) {
			System.err.println("큐가 비어있습니다.");
			System.exit(-1);
		}
		QueueNode tmp = front;
		Object item = tmp.getItem();

		front = front.getLink();
		if (front == null) {
			rear = null;
		}

		return item;
	}

	public Object peek() {
		if (isEmpty()) {
			System.err.println("큐가 비어있습니다.");
			System.exit(-1);
		}

		return front.getItem();
	}
}
