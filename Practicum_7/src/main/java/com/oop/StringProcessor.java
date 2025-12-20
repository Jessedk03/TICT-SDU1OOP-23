package com.oop;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        this.processen = new ArrayList<>();
    }

    public String verwerk(String input) {
        String edited = input;

        for (OpmaakProces p : processen) {
            edited = p.maakOp(edited);
        }

        return edited;
    }

    public void voegProcesToe(OpmaakProces process) {
        if (process != null) {
            processen.add(process);
        }
    }
}
