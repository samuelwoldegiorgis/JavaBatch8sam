package com.syntax.class18;

public class Employee {
    int empId;
    double salary;
    String CEO;

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.empId=123;
        employee1.salary=80000.00;
        employee1.CEO="Sumair";

        System.out.println(employee1.empId+" "+ employee1.salary+" "+employee1.CEO);

        Employee employee2=new Employee();
        employee2.empId=456;
        employee2.salary=1000000.00;
        employee2.CEO="Ashghar";
        System.out.println(employee2.empId+" "+ employee2.salary+" "+employee2.CEO);
    }
}
