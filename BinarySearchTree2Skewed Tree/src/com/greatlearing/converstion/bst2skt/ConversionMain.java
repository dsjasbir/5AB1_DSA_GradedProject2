/**
 * 
 */
package com.greatlearing.converstion.bst2skt;

import java.util.LinkedList;

/**
 * @author jasbirsingh
 *
 */
public class ConversionMain {

	private static final String root = null;

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list =new LinkedList<Integer>();
		BinarySearchTree bst = new BinarySearchTree();   // Binary Search Tree
		BinarySearchTree st = new BinarySearchTree();    // Skewed Tree
		
		bst.insert(50);
		bst.insert(30);
		bst.insert(60);
		bst.insert(10);
		bst.insert(55);
		
		
		System.out.println("In Order Traversal");
		list = bst.inorderlist();
		
		// Creation of Skewed Binary Tree
		
		for (int i : list) {	
			System.out.println(i);
			st.insert(i);			
		}
			
		
		
		System.out.println("Skewed Tree");
		System.out.println(st.inorderlist());
		
		
		
		
		
		
	}


}
