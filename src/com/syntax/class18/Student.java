package com.syntax.class18;

public class Student {
    String studentName;
    int studentId;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student student1=new Student();
        student1.studentName="Q";
        student1.studentId=12;
        student1.numberOfStudents=1;
        Student student2=new Student();
    student2.studentName="S";
    student2.studentId=5;
    student2.numberOfStudents++;
    Student student3=new Student();
    student3.studentName="T";
    student3.studentId=3;
    student3.numberOfStudents++;
        System.out.println(numberOfStudents);

    }
}
