package datastructure.queue;

public class QueueNode {
	private Object item;
	private QueueNode link;

	public QueueNode() {

	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

	public QueueNode getLink() {
		return link;
	}

	public void setLink(QueueNode link) {
		this.link = link;
	}

}
