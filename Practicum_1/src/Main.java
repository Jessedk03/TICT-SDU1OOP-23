public class Main {
    public static void main(String[] args) {
        /**
         * Opdracht 1:
         * In the for loop I put an int of 'j' as 1, then for the termination I said 'j <= 10'
         * This will keep incrementing 'j' while 'j' is smaller or equal to 10. since i did not zero index 'j'
         * this code will print '1, 2, 3 ... 10'
         * --------------------------------------
         *         for (int j = 0; j < 10; j++) {
         *             System.out.println(j);
         *         }
         * --------------------------------------
         * this code will print '0, 1, 2 ... 9' since it is zero indexed.
         * keeping the initialization the same and change the termination to 'j < 11' in the code below
         * will give the same result.
         */

        System.out.println("\n'1 ... 10' with for loop ");

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        /**
         * Opdracht 2:
         * Because 'i = 0' beginning in the while loop wil it run 10 times, since 'i = 0'.
         * But before printing 'i' I add a 1 each iteration 10 times which results in a '1 ... 10'
         */

        System.out.println("\n'1 ... 10' with while loop");
        int i = 0;
        while (i < 10) { // 0 ... 9 = 10x
            i++; // 1 ... 10
            System.out.println(i);
        }

        /**
         * Opdracht 3:
         * Printing each iteration and a random number per iteration.
         * Not providing 'Math.random()' with a range, the standard range is '0.00...' and '1.00...',
         * otherwise the code would look like:
         * ----------------------------------------------------
         * double random = ((Math.random() * (max - min)) + min);
         * ----------------------------------------------------
         * with a 'max = 15;' and 'min = 5;'
         *
         * I use 'printf' so I can print variables with a format specifier:
         * https://www.geeksforgeeks.org/java/format-specifiers-in-java/
         */

        System.out.println("\nPrinting random number between '0.0' and '1.0'");

        for (int j = 1; j < 11; j++) {
            double random = Math.random();
            System.out.printf("Iteration: #%d Random number: %.1f == %f \n", j, random, random);
        }

        /**
         * Opdracht 4:
         * The sum of all the iterations added onto each other should be 780,
         * in this for loop I use the Arithmetic Operator '+' to add the previous iteration onto the next. as shown in
         * the first four iterations:
         * ----------------------------------
         * Iteration: #0 Sum: 0 Calc: (0 + 0)
         * Iteration: #1 Sum: 1 Calc: (0 + 1)
         * Iteration: #2 Sum: 3 Calc: (1 + 2)
         * Iteration: #3 Sum: 6 Calc: (3 + 3)
         * ----------------------------------
         */

        System.out.println("\nSum of '0 to 39'");
        int sum = 0;
        for (int j = 0; j < 40; j++) {
            int prevSum = sum;
            sum += j;
            System.out.printf("Iteration: #%d Sum: %d Calc: (%d + %d)\n", j, sum, prevSum, j);
        }
        System.out.printf("Final sum: %d\n", sum);

        /**
         * Opdracht 5:
         * For printing a sawtooth pattern I chose for the modulus operator '%',
         * in the code below 'j % 2' it calculates the remainder of the integer division of 'j' by 2
         * since 2 is the smallest even integer where the remainder of a division is either '1' or '0'.
         * It all comes down to number theory and division algorithm.
         *
         * I added the else statement for better readability the following code does the same:
         * -----------------------------------------
         *         for (int j = 0; j < 4; j++) {
         *             if (j % 2 == 0){
         *                 System.out.println("s");
         *                 continue;
         *             }
         *             System.out.println("ss");
         *         }
         * -----------------------------------------
         * the 'continue;' says "okay we are done here for this iteration" while 'return;' exits out of the whole for-loop
         * once its reached, which serves its own purpose.
         */

        System.out.println("\nPrint sawtooth pattern");

        for (int j = 0; j < 4; j++) {
            if (j % 2 == 0){
                System.out.println("s");
            } else {
                System.out.println("ss");
            }
        }

    }
}