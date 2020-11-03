package com.syntax.class16;

public class Task3 {



    public static void print(String myString){

        String reverseString = new StringBuffer(myString).reverse().toString();
        print("madam");
        if (myString.equals(reverseString)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
