/**
 * 
 */
package com.greatlearning.buildingskyscraper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


/**
 * @author jasbirsingh
 *
 */
public class AssembleingMain {

	private static int noOfFlours, positionOfMaxSizeFlour;
	private static int[] arrOfFlours,sortedArrOfFlours;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);
		noOfFlours = sc.nextInt();
		arrOfFlours = new int[noOfFlours];
		
		for( int i = 0 ; i< noOfFlours ; i++) {
			System.out.println("enter the floor size given on day :" + (i+1));
			arrOfFlours[i] = sc.nextInt();
		}
	
		
		sortedArrOfFlours = arrOfFlours.clone();
		Arrays.sort(sortedArrOfFlours);
		
		
		
		
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("The order of construction is as follows");
		
		positionOfMaxSizeFlour = noOfFlours-1;
		
		for(int i = 0; i<noOfFlours; i++ ) {
			System.out.println("\nDay : " + (i+1));
			stack.push(arrOfFlours[i]);
			if(stack.peek()>=sortedArrOfFlours[positionOfMaxSizeFlour]) {
				
				while(stack.empty()==false) {
					if(stack.peek()<=positionOfMaxSizeFlour)
						break;
					System.out.print(stack.pop() + " ");
					positionOfMaxSizeFlour--;
					
				}
				
			}
			
		}
		
		
		
		sc.close();

	}


}
