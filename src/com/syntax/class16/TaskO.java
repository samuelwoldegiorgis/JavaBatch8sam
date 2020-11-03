package com.syntax.class16;

public class TaskO {
    public static void main(String[] args) {
        oddNum(5);
    }
    public static void oddNum(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
