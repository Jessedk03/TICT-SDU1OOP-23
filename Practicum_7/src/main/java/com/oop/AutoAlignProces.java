package com.oop;

public class AutoAlignProces implements OpmaakProces {

    private final boolean isLeftOutline;

    public AutoAlignProces(boolean isLeft) {
        this.isLeftOutline = isLeft;
    }

    public String autoAlignString(String input) {
        StringBuilder sb = new StringBuilder();
        String[] stringArray = input.split(" ");

        int maxLengte = maxLengthFinder(stringArray);

        for (String woord : stringArray) {
            String autoAlignedWoord = String.format("%" + maxLengte + "s" ,woord);
            sb.append(autoAlignedWoord);
            sb.append("\n");
        }

        return sb.toString();
    }

    private int maxLengthFinder(String[] array) {
        // probeer het langste woord te vinden.
        int max = 0;
        for (String woord : array) {
            if (woord.length() > max) {
                max = woord.length();
            }
        }

        if (isLeftOutline) {
            max = max * -1;
        }

        return max;
    }

    @Override
    public String maakOp(String input) {
        return autoAlignString(input);
    }
}
