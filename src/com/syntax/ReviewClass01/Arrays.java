package com.syntax.ReviewClass01;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//2 floor
        //2 apartments in each floor
        //3 rooms in each apartment

    String [][][] arr3d=new String[2][2][3];
    Scanner scan=new Scanner(System.in);
    for(int i=0; i<arr3d.length; i++){
        for(int j=0; j<arr3d[i].length; j++){
       for(int z=0; z<arr3d[i][j].length; z++){
           System.out.println("Please enter a name: ");
           arr3d[i][j][z]=scan.nextLine();
       }

       }


       }
    for(String[][] arr2d:arr3d){
        for(String[] arr1d:arr2d){
            for(String value:arr1d){
                System.out.println(value+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }
}
