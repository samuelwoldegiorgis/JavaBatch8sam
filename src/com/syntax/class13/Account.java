package com.syntax.class13;

public class Account {
    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;

    boolean login(String userName, String password) {
        if (userName.equals(userName) &&
                password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
