package com.syntax.class15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String momsName, dadsName,babyName;
        
        System.out.println("please enter moms name");
        momsName = scanner.nextLine();
        
        System.out.println("please enter dads name");
        String gender = scanner.nextLine();
        
        if(gender.toLowerCase().startsWith("b")) {
            String firstPart = dadsName.substring(0, dadsName.length() / 2);
            String lastPart = momsName.substring(momsName.length() / 2);
        }else {
            
            babyName="No suggestions";
       
        }
        System.out.println("babyname");
    }
}
