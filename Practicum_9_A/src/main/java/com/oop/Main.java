package com.oop;

public class Main {
    public static void main(String[] arg) {
        String test1 = Utils.euroBedrag(3.11314);
        String test2 = Utils.euroBedrag(3.11314, 1);
        System.out.println(test1);
        System.out.println(test2);

        System.out.println(Utils.aangeroepen());
    }
}