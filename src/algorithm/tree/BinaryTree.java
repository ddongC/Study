package algorithm.tree;

import datastructure.tree.TreeNode;

public class BinaryTree {

	public int getNodeCount(TreeNode node) {
		int count = 0;

		if (node != null) {
			count = 1 + getNodeCount(node.getLeft()) + getNodeCount(node.getRight());
		}

		return count;
	}

	public int getLeafCount(TreeNode node) {
		int count = 0;

		if (node != null) {
			if (node.getLeft() == null && node.getRight() == null) {
				return 1;
			} else {
				count = getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
			}
		}

		return count;
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public int getHeight(TreeNode node) {
		int height = 0;

		if (node != null) {
			height = 1 + max(getHeight(node.getLeft()), getHeight(node.getRight()));
		}

		return height;
	}

}
