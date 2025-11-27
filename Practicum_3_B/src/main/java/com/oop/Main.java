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

        /**
         * Explaining the output of the following code:
         * c1 = new Cirkel(10, 0, 0);
         * c2 = new Cirkel(0, 10, 10);
         * - see the stracktrace_image.png for the output -
         *
         * as you can see a trace has been set for us to following and find where in the code it exactly goes wrong
         * we can see the exact steps happened at runtime so we can lead it back to a cause.
         * in this example we know what the cause is and that is because we say in the cirkel constructor:
         *         if (rad <= 0) {
         *             throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
         *         }
         * throw a new instance of that exception if the conditions are true.
         * now since the IllegalArgumentException is an unchecked exception it is okay if it lives inside your application,
         * with that I mean that it could already exist in the code and just happen at runtime if conditions are not met.
         * if we do not catch those exceptions it would crash our application... :-(
         *
         * with the following code we create a checked exception:
         * FileReader file = new FileReader("not_a_file.txt");
         * - see the not_a_file_error_line_ide.png image for fuller context and where the IDE helps us with -
         *
         * as you can see on the image is that the IDE helps us already with the checked exceptions,
         * by pointing it out.
         *
         * With checked exceptions you CANNOT place it in your code and compile it without
         * having a compile-time-error.
         * - see stacktrace_checked_expression_file_reader.png to see the stacktrace -
         *
         */
    }
}