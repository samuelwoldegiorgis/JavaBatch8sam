package com.syntax.class16;

public class TaskFour {
    static void sayHello(String countryName){
        switch (countryName){
            case"USA":
                System.out.println("Hello");
                break;
            case"China":
                System.out.println("Ni Hao");
                break;
            case "Turkey":
                System.out.println("Marhaba");
              break;
            default:
                System.out.println("country not supported");
        }
    }
}
