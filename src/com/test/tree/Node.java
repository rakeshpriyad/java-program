package com.test.tree;

class Node {
	int data;
	Node left, right, parent;

	Node(int item) {
		data = item;
		left = right = null;
	}
}
