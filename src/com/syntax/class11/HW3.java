package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		//Create an array of countries.
		//While retrieving all values from an array print capital for each country.
		//(use 2 different loops).
		String[] country=new String [5];
		country[0]="Italy";
		country[1]="France";
		country[2]="Germany";
		country[3]="Spain";
		country[4]="England";
		
		String[] capital=new String[5];
		capital[0]="Rome";
		capital[1]="Paris";
		capital[2]="Berlin";
		capital[3]="Madrid";
		capital[4]="London";
		
		for(int i=0; i<country.length; i++) {
			
			System.out.println("The capital city of "+country[i]+" is "+capital[i]);
			
		}
		System.out.println("------------2nd way----------------");
		
		String[] countries= {"Brazil","Argentina","Mexico"};
		String[] capitals= {"Brasilia","Buenos Aires","Mexico City"};
		
		for(int a=0; a<countries.length; a++) {
			System.out.println("The capital city of "+countries[a]+" is "+capitals[a]);
		}

	}

}
