package com.syntax.ReviewClass01;

public class Student {
    public static void main(String[] args) {
        School.schoolName="Harvard University";

        School stu1=new School();
        stu1.name="John";
        stu1.lastName="Terry";
        stu1.age=12;

        School stu2=new School();
        stu2.name="James";
        stu2.lastName=" Millner";
        stu2.age=9;

        System.out.println(stu1.name);
        System.out.println(stu2.name);
        System.out.println(stu1.schoolName);
        System.out.println(stu2.schoolName);
    }
}
