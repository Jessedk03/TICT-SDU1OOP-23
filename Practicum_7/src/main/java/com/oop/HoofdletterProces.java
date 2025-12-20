package com.oop;

public class HoofdletterProces implements OpmaakProces {
    public HoofdletterProces() {
        super();
    }

    @Override
    public String maakOp(String input) {
        return input.toUpperCase();
    }
}
