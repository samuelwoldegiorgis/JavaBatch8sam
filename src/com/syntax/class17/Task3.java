package com.syntax.class17;

import java.util.Scanner;

public class Task3 {
    private static char getGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score >80) {
            return 'B';
        } else if (score >70) {
            return 'C';
        } else if (score >50) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = inpu.nextInt();
        System.out.println("Your grade is: "+getGrade(score));
    }

}
