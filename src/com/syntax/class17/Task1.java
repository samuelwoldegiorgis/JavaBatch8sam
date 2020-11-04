package com.syntax.class17;

import java.util.Scanner;

public class Task1 {
    private static String createEmail (String userName, String lastName, String emailType){
        String completeEmail = userName.toLowerCase() +
                lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
        return completeEmail;
    }
    public static void main (String[]args){
        String userName, lastName, emailType, completeEmail;
        System.out.println("Enter your name:");
        Scanner inpu = new Scanner(System.in);
        userName = inpu.nextLine();
        System.out.println("Enter your last name:");
        lastName = inpu.nextLine();
        System.out.println("Enter your email type:");
        emailType = inpu.nextLine();
        completeEmail = createEmail(userName,lastName,emailType);
        System.out.println(completeEmail);

}
}
