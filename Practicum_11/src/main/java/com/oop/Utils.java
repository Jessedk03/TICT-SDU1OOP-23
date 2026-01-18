package com.oop;

abstract class Utils {

    // rates as of 17-01-2026
    protected static double euroToDollarConversionRate = 1.1597899427;
    protected static double dollarToEuroConversionRate = 0.918720;

    public static String euroToDollarExample() {
        return String.format("(1 EURO is %.2f USD, koers is %.4f)", euroToDollarConversion(1), euroToDollarConversionRate);
    }

    public static String dollarToEuroExample() {
        return String.format("(1 USD is %.2f EURO, koers is %.4f)", dollarToEuroConversion(1), dollarToEuroConversionRate);
    }


    /**
     * Calculates the conversion from dollars to euros.
     *
     * @param e the amount of euros
     * @return the amount in dollars
     */
    public static double euroToDollarConversion(double e) {
        return e * euroToDollarConversionRate;
    }

    /**
     * Calculates the conversion from dollars to euros.
     *
     * @param d the amount of dollars.
     * @return the amount in euros
     */
    public static double dollarToEuroConversion(double d) {
        return dollarToEuroConversion(dollarToEuroConversionRate, d);
    }

    public static double dollarToEuroConversion(double r, String d) {
        try {
            d = d.replace(',', '.');
            double dC = Double.parseDouble(d);
            return dollarToEuroConversion(r, dC);
        } catch (NumberFormatException e) {
            System.out.println("Graag alleen cijfers in de String parameter.");
            throw e;
        }
    }

    public static double dollarToEuroConversion(double r, double d) {
        return d * r;
    }


}
