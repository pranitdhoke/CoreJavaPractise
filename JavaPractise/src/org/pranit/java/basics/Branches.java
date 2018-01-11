package org.pranit.java.basics;

public class Branches {
	public static int count(int[] tree) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createTree(tree, tree.length);
		int leafNodeCount = binaryTree.getLeafCount();
		return tree.length - leafNodeCount;
	}

	public static void main(String[] args) {
		System.out.println(Branches.count(new int[] { 1, 3, 1, -1, 3 }));
	}
}

class Node {
	int key;
	Node left, right;

	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	void createNode(int parent[], int i, Node created[]) {
		if (created[i] != null)
			return;

		created[i] = new Node(i);

		if (parent[i] == -1) {
			root = created[i];
			return;
		}

		if (created[parent[i]] == null) {
			createNode(parent, parent[i], created);
		}

		Node p = created[parent[i]];

		if (p.left == null) {
			p.left = created[i];
		} else {
			p.right = created[i];
		}
	}

	Node createTree(int parent[], int n) {
		Node[] created = new Node[n];
		for (int i = 0; i < n; i++)
			created[i] = null;

		for (int i = 0; i < n; i++)
			createNode(parent, i, created);

		return root;
	}

	void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(node.key + " ");
			inorder(node.right);
		}
	}

	int getLeafCount() {
		return getLeafCount(root);
	}

	int getLeafCount(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getLeafCount(node.left) + getLeafCount(node.right);
	}
}