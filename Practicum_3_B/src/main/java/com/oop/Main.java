package com.oop;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        /**
         * If the try-catch block weren't in the main method then the second cirkel (c2) would
         * throw the IllegalArgumentException which is an unchecked exception. In c2 we said that it would need to
         * throw that exception if the rad: is smaller or equal to zero, (inf, 0].
         * we would get those at runtime and not while compiling which checked exceptions do.
         * if we do not catch unchecked exceptions, while it throws them, it crashes the program.
         */

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}