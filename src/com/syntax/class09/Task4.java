package com.syntax.class09;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
	
		
		Scanner input;
		String item;
		int cost;
		int money;
		
		input=new Scanner(System.in);
		System.out.println("what would you like to buy?");
		item=input.next();
		System.out.println("how much of this cost item?");
		cost=input.nextInt();
		
		System.out.println("please pay the amount");
		money=input.nextInt();
		
		while(money==cost) {
			System.out.println("thank you for shopping!");
			break;
		}
		if(money<cost) {
			System.out.println("please add more money");
			money=input.nextInt();
			System.out.println("thank you for shopping!");
			
		}else if(money>cost) {
			System.out.println("please take your change of $"+(money-cost));
			System.out.println("thank you for shopping");
		}
		
		
		
		
	}

}
