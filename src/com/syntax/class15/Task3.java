package com.syntax.class15;

public class Task3 {
    public static void main(String[] args) {
        String a = "Is it saturday? Is it raining? Do we have java class today";
        String[] array = a.split("[^A-Z a-z 0-9]");
        System.out.println(array.length);
    }

}
