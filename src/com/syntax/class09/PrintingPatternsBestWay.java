package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
	for (int r=1; r<=4; r++) {
    for (int c=1; c<=5; c++) {
    	c++;
    	System.out.print("*");
    }
      System.out.println();
	}
	
	for (int r=1; r<=4; r++) {
		for (int c=1; c<=5; c++) {
			System.out.print(c++);
		}
		System.out.println();
	}
	for (int i=7; i>=1; i--) {
		for (int c=6; c>=1; c--) {
			System.out.print(i);
		}
	System.out.println();
	}
	for(int i=5; i<=5; i++) {
		for (int c=7; c>=1; c--) {
			System.out.print(c);
	}
		System.out.println();	
}
	for(int r=1; r<=5; r++) {
		for (int c=7; c>=1; c--) {
			System.out.print(c);
		}
		System.out.println();
	}
}}