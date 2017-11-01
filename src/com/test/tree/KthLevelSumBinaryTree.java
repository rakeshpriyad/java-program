package com.test.tree;
public class KthLevelSumBinaryTree {
	Node root;
	Integer sum=0;

	
	public void printKDistant(Node node, int k) {
		if (node == null)
			return;
		if (k == 0) {
			System.out.print(node.data + " ");
			sum += node.data;
			return;
		} else {
			printKDistant(node.left, k - 1);
			printKDistant(node.right, k - 1);
		}
	}
	
	public Integer printSumKDistant(Node node, int k) {
		if (node == null)
			return 0;
		if (k == 0) {
			System.out.print(node.data + " ");
			return sum+= node.data;
		} else {
			printSumKDistant(node.left, k - 1);
			printSumKDistant(node.right, k - 1);
			return sum;
		}
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		KthLevelSumBinaryTree tree = new KthLevelSumBinaryTree();

/* Constructed binary tree is
        1
      /   \
     2     3
    /  \   /
   4    5 8 
*/
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(8);

		//tree.printKDistant(tree.root, 2);
		Integer s=tree.printSumKDistant(tree.root, 2);
		System.out.println(s);
	}
}
