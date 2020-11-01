package com.syntax.class14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter a word");
        String word= input.nextLine();
        if(word.length()>3 && word.length()%2==1){
            System.out.println("printing the character in the middle:");
            System.out.println(word.charAt(word.length()/2));
        }
        else {
            System.out.println("please enter 3 characters or more, line cannot be empty");
        }
        String reverse="";
        for (int i=word.length()-1; i>=0 ; i--) {
            reverse+= word.charAt(i);
        }
        System.out.println("the reverse of the word is:" + reverse);
    }

}
