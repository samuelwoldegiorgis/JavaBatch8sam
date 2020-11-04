package com.syntax.class17;

public class HW2 {
    boolean isPrime(int number){
        boolean isPrime=true;
        for(int i=2; i<=number/2; i++){
            if(number %i==0){
                isPrime=false;
                break;


            }
        }
        return isPrime;
    }

}
