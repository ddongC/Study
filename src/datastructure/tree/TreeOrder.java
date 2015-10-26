package datastructure.tree;

import datastructure.queue.MyQueue;

public class TreeOrder {
	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}

	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.getData() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}

	public void levelOrder(TreeNode ptr) {
		MyQueue q = new MyQueue();

		q.enqueue(ptr);
		while (!q.isEmpty()) {
			ptr = (TreeNode) q.dequeue();
			System.out.print(ptr.getData() + " ");
			if (ptr.getLeft() != null) {
				q.enqueue(ptr.getLeft());
			}
			if (ptr.getRight() != null) {
				q.enqueue(ptr.getRight());
			}
		}
	}

}
