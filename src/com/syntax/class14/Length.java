package com.syntax.class14;

public class Length {
    public static void main(String[] args){
        String name="Qasim";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="Ahmed Qasim";
        if(name.length()>10){
            System.out.println("you are great");
        }
    }
}
