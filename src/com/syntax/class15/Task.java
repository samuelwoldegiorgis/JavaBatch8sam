package com.syntax.class15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String username;
        String password;
        String confirmedPassword;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter username");
        username=scanner.nextLine();
        System.out.println("please enter password");
        password=scanner.nextLine();
        System.out.println("confirm password");
        confirmedPassword= scanner.next();


        if(username.isEmpty() || password.isEmpty()) {
            System.out.println("username and password can't be empty");
        }else{
            if(password.length()<8) {
                System.out.println("password is too short");
            }else{
                if(password.contains(username)) {
                    System.out.println("password can't contain username");
                }else{
                    if(!password.equals(confirmedPassword)){
                        System.out.println("Passwords do not match");
                    }else{
                        System.out.println("your username and password has been created");
                    }
                }

            }
        }
    }
}
