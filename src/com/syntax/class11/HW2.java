package com.syntax.class11;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array on double using scanner and
		//calculate the sum of all elements that was
		//stored in an array.
		
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter the number of double values you want to enter");
				int arraySize = input.nextInt();
				if( arraySize>0) {
				double[] num = new double[arraySize];
				double total = 0;
				System.out.println("please enter the values you want to calculate the sum");
				for (int i = 0; i < num.length; i++) {
					
					num[i] = input.nextDouble();
					total += num[i];
				}
				System.out.println(" The total of the number of elements is: " + total);
			}
			else {
				System.out.println("Please enter a valid positive number");
			}
	}

}
