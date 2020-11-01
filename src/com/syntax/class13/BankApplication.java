package com.syntax.class13;

public class BankApplication {
    public static void main(String[] args) {

        Account burjusAccount = new Account();
        burjusAccount.accountId="123";
                burjusAccount.userName="Burju";
                burjusAccount.password="pass123";
                burjusAccount.balance=1000000;
                burjusAccount.typeOfAccount="checking";
                burjusAccount.limit=125;


        boolean isLoggedIn=burjusAccount.login("Burju","pass123");
        System.out.println(isLoggedIn);
            }
}



