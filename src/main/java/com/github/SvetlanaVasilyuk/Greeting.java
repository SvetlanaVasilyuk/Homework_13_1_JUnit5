package com.github.SvetlanaVasilyuk;

public class Greeting {
    public static String simpleGreet() {
        return "Приветствую!";
    }

    public static String personalGreet(String name, String surname) {
        return String.format("Приветствую, %s %s!", name, surname);
    }
}
