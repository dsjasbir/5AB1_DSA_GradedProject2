package com.greatlearing.converstion.bst2skt;

public class BinarySearchTree {
	
	
	//Node Creation
	class Node{
		int key;
		Node left,right;
		
		public Node(int item) {
			key = item;
			left = right = null;
			
		}
		
	}
	

	Node root;

	BinarySearchTree(){
		
		root = null;
	}

	
	void insert(int key) {
		
		root = insertkey(root,key);
	}


	private Node insertkey(Node root, int key) {
		// Return a new node if the tree is empty
		
		if (root ==null) {
			 
			root = new Node(key);
			return root;
		}
		
		// Traverse to the right place and insert the node
		
		if(key < root.key) 
			root.left = insertkey(root.left,key);
		else if (key > root.key)
			root.right = insertkey(root.right,key);
		
		return root;
	}		
	
	
	
	void inorder() {
	    inorderRec(root);
	  }

	  // Inorder Traversal
	  void inorderRec(Node root) {
	    if (root != null) {
	      inorderRec(root.left);
	      System.out.print(root.key + " -> ");
	      inorderRec(root.right);
	    }
	  }
	
	
}
