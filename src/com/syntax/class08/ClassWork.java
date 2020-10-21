package com.syntax.class08;

public class ClassWork {

	public static void main(String[] args) {
		
  for (int i=1; i<100; i++) {
	  System.out.println(i);
  }
    System.out.println("_______________");
    
    for (int i<=100; i>1; i--){
    	System.out.println(i);
    }
    System.out.println("_______________");
    
    for (int i=20; j>1; i--) {
    	i++;
    System.out.println(i);
	   }
	
	//Calculate sum of even and odd numbers from range 1 to 50
	int sum=0;
	System.out.println("sum of even numbers");
	for (int i=1; i<=50; i++) {
		if(i%2==0) {
			sum+=i;
		}
	}
	System.out.println(sum);
	
	int sumOdd=0;
	System.out.println("sum of the odd nums");
	for(int i=1; i<=50; i++) {
		if(i%2==1) {
			sumOdd+=i;
		}
	}
	
	}
	}
