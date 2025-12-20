package com.oop;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<Object> processen = new ArrayList<>();

    public StringProcessor(){}

    public String verwerk(String input) {
        String edited = input;
        for (Object p : processen) {
            if (p instanceof OpmaakProces) {
                edited = ((OpmaakProces)p).maakOp(edited);
            }
        }
        return edited;
    }

    public void voegProcesToe(Object process) {
        if (process != null) {
            processen.add(process);
        }
    }
}
