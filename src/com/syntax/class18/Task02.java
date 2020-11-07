package com.syntax.class18;

public class Task02 {
    public static void main(String args[]) {
        String str = "Java Class";
        System.out.println(getReverse(str));
    }
    public static String getReverse(String a){
        String reverse = "";
        char[] charArr = a.toCharArray();
        for(int i = charArr.length - 1; i >= 0 ; i--){
            reverse+=charArr[i];
        }
        return reverse;
    }
}
