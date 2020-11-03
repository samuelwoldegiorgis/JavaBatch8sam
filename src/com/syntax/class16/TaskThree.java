package com.syntax.class16;

public class TaskThree {
    public void isStringPalindrome(String string) {
        int i=0;
        int j= string.length()-1;
        while(i<j) {

            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("String is not as palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is not as palindrome");
    }
}
