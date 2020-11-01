package com.syntax.class15;

import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("what is the name of the mom");
            String momName = input.nextLine();
            System.out.println("what is the name of the dad");
            String dadName = input.nextLine();
            System.out.println("are you expecting a boy a girl");
            String gender = input.nextLine();
            String babyName1 = "";
            String babyName2 = "";
            if (gender.equalsIgnoreCase("boy")) {
                babyName1 = dadName.substring(0, 2);
                momName.length();
                babyName2 = momName.substring((momName.length() - 2), momName.length());
                System.out.println(babyName1 + babyName2);
            } else if (gender.equalsIgnoreCase("girl")) {
                babyName1 = momName.substring(0, 2);
                babyName2 = dadName.substring((dadName.length() - 2), dadName.length());
                System.out.println(babyName1 + babyName2);
            }
        }
}
