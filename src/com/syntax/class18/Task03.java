package com.syntax.class18;

public class Task03 {
    public static void main(String args[]) {
        String str = "Bize Her Yer Trabzon";
        System.out.println(getVowels(str));
    }
    private static String getVowels(String a){
        String vowels = "AaEeIiOoUu";
        String vowelsInString = "";
        char[] charArr = vowels.toCharArray();
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < charArr.length; j++){
                if(a.charAt(i)==(charArr[j])){
                    vowelsInString+=charArr[j];
                }
            }
        }
        return vowelsInString;
    }
}
