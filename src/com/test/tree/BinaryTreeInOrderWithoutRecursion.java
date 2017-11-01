package com.test.tree;

import java.util.Stack;

public class BinaryTreeInOrderWithoutRecursion {
	Node root;

	
	
	//inorder using stack
	 void inorder() {
	        if (root == null) {
	            return;
	        }
	        
	        //keep the nodes in the path that are waiting to be visited
	        Stack<Node> stack = new Stack<Node>();
	        Node node = root;
	         
	        //first node to be visited will be the left one
	        while (node != null) {
	            stack.push(node);
	            node = node.left;
	        }
	         
	        // traverse the tree
	        while (stack.size() > 0) {
	           
	            // visit the top node
	            node = stack.pop();
	            System.out.print(node.data + " ");
	            if (node.right != null) {
	                node = node.right;
	                 
	                // the next node to be visited is the leftmost
	                while (node != null) {
	                    stack.push(node);
	                    node = node.left;
	                }
	            }
	        }
	    }
	
	 
	 public void preorder(Node node) {
         
	        // Base Case
	        if (node == null) {
	            return;
	        }
	 
	        // Create an empty stack and push root to it
	        Stack<Node> nodeStack = new Stack<Node>();
	        nodeStack.push(root);
	 
	        /* Pop all items one by one. Do following for every popped item
	         a) print it
	         b) push its right child
	         c) push its left child
	         Note that right child is pushed first so that left is processed first */
	        while (nodeStack.empty() == false) {
	             
	            // Pop the top item from stack and print it
	            Node mynode = nodeStack.peek();
	            System.out.print(mynode.data + " ");
	            nodeStack.pop();
	 
	            // Push right and left children of the popped node to stack
	            if (mynode.right != null) {
	                nodeStack.push(mynode.right);
	            }
	            if (mynode.left != null) {
	                nodeStack.push(mynode.left);
	            }
	        }
	    }
	 
	 
	public Node insert(Node node, int key) {
		/* If the tree is empty, return a new node */
		if (node == null)
			return new Node(key);

		/* Otherwise, recur down the tree */
		if (key < node.data) {
			node.left = insert(node.left, key);
			node.left.parent = node;
		} else if (key > node.data) {
			node.right = insert(node.right, key);
			node.right.parent = node;
		}

		/* return the (unchanged) node pointer */
		return node;
	}

	// Function to print inorder traversal using parent
	// pointer
	void inorder(Node root) {
		boolean leftdone = false;

		// Start traversal from root
		while (root != null) {
			// If left child is not traversed, find the
			// leftmost child
			if (!leftdone) {
				while (root.left != null) {
					root = root.left;
				}
			}

			// Print root's data
			System.out.print(root.data + " ");

			// Mark left as done
			leftdone = true;

			// If right child exists
			if (root.right != null) {
				leftdone = false;
				root = root.right;
			}

			// If right child doesn't exist, move to parent
			else if (root.parent != null) {
				// If this node is right child of its parent,
				// visit parent's parent first
				while (root.parent != null && root == root.parent.right)
					root = root.parent;

				if (root.parent == null)
					break;
				root = root.parent;
			} else
				break;
		}
	}

	public static void main(String[] args) {
		BinaryTreeInOrderWithoutRecursion tree = new BinaryTreeInOrderWithoutRecursion();
        tree.root = tree.insert(tree.root, 24);
        tree.root = tree.insert(tree.root, 27);
        tree.root = tree.insert(tree.root, 29);
        tree.root = tree.insert(tree.root, 34);
        tree.root = tree.insert(tree.root, 14);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 22);
        tree.root = tree.insert(tree.root, 13);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 6);
  

		System.out.println("Inorder traversal is ");
		tree.inorder(tree.root);
		System.out.println();
		tree.inorder();
		System.out.println();
		tree.preorder(tree.root);
	}
}