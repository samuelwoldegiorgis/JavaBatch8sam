package com.syntax.class19;

public class Task1 {


    private final ageValue;
    int age;
    String name;
    char grade;

    Task1(){
        System.out.println("I will be called when no arguments are passed to the constructors");


      
        age=ageValue;
   name=nameValue;
    }
    Task1(int ageValue, String nameValue, char gradeValue){

        age=ageValue;
        name=nameValue;
        grade=gradeValue;
        System.out.println("I will be called when 2 arguments are passed to the constructors");

    }

    public static void main(String[] args) {

    }
}
