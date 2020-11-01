package com.syntax.class15;

public class regex {
    public static void main(String[] args) {
        String str = "!#$GERadfv029348fjasdFAWE";
        System.out.println(str.replaceAll("[^a-zA-Z]", "").length());
    }
}
