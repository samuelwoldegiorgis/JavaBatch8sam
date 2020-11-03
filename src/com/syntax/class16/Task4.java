package com.syntax.class16;

public class Task4 {

    public static void main(String[] args) {
        translateToOtherLanguage("EN");
    }
    static void translateToOtherLanguage(String country){
        String output = "";
        switch (country) {
            case "ENG": output = "Hello";break;
            case "TR": output = "Selam";break;
            case "RUS": output = "Здравствуй";break;
            case "UYG": output = "ياخشىمۇسىز";break;
            case "GER": output = "Hallo";break;
            default:output = "Invalid country code"; break;
        }
        System.out.println(output);
    }
}
