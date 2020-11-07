package com.syntax.class18;

import com.syntax.class16.Task1;

public class Task01 {
    public static void main(String args[]) {
        int[] arr = {7, -2, 9, 11, -98, 13, -9};
        Task1 obj = new Task1();
        int sum = obj.getSum(arr);
        System.out.println(sum);
    }
    int getSum(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
}
