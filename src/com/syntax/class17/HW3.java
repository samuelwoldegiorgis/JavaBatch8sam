package com.syntax.class17;

public class HW3 {
    static char getGrade(int marks){
        char grade='F';
        if(marks>90 && marks<=100){

            grade='A';

        }else if(marks>80&&marks<90){
            grade= 'B';


        }else if(marks>70&&marks<80){
            grade= 'C';

        }else if(marks>60&&marks<70) {
            grade = 'D';
        }else{
            grade='F';


        }
        return grade;
    }

    public static void main(String[] args) {
        HW3 hw3=new HW3();
        System.out.println("hw3.getGrade(90)" +HW3.getGrade(90));
        System.out.println("hw3.getGrade(101)" +HW3.getGrade(101));
        System.out.println("hw3.getGrade(40)" +HW3.getGrade(40));
        System.out.println("hw3.getGrade(70)" +HW3.getGrade(70));
        System.out.println("hw3.getGrade(-1)" +HW3.getGrade(-1));
    }
}
