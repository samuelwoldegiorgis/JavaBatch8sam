package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {
	
for (int i=10; i<=10; i++) {
	for (int j=1; j<=4; j++) {
		System.out.println("i ="+i+" j="+j);
		
	}
	System.out.println();
}

System.out.println("___________________");
	

for (int i=10; i<=99; i++) {
System.out.println(i+" ");
	
	
}
for (int i=1; i<=9; i++) {
	for (int j=0; j<=9; j++) {
		System.out.println(i+" "+j);
	}
}

 System.out.println("_______________ how can i print clock____________");
 
 for (int h=0; h<24; h++) {
	 for(int m=0; m<60; m++) {
		 if(m<10) {
			 System.out.println(h + ":0" + m);
		 }else {
		 System.out.println(h + ":" + m );
	 }
 
	}
	 
	
	 }
		 System.out.println();
	 
		 for (int a = 0; a < 100; a++) {
				for (int b = 0; b < 100; b++) {
					for (int c = 0; c < 100; c++) {
						for (int d = 0; d < 100; d++) {
							for (int e = 0; e< 100; e++) {
							System.out.println(a + " " + b + " " + c + " " + d);
						}
					}
				}
			}
		 
		 }}}
 
	 
 
 
	
	
	
	

