package com.syntax.class13;

public class Dog {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.age = 3;
        d1.isFriendly = true;
        d1.name = "Lessie";
        d1.type = "Bulldog";
        d1.gender = 'F';
        d1.isHealthy = true;
        d1.bark();
        d1.fetch();
        d1.play();


        void play() {
            System.out.println("Dog plays");}
        }
    }

