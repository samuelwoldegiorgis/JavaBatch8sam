package com.syntax.class13;

public class SmartPhone {

    String brand;
    String color;
    String model;
    String text;

    void call(String phoneNumber) {
        System.out.println("Calling"+phoneNumber);
    }
    void text() {
        System.out.println(brand + " sending the text");
    }
    void pics() {
        System.out.println(brand + " taking picture");
    }

    }

