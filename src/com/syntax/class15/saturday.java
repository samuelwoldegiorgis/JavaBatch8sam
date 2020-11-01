package com.syntax.class15;



public class saturday {
    public static void main(String[] args) {

        ;String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String newA= a.replaceAll("[a-z A-Z]", "");
        System.out.println(newA.length());
    }
}
