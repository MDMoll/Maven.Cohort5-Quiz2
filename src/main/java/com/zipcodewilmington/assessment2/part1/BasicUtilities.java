package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return 5 <= valueToEvaluate && valueToEvaluate <= 7;
    }

    public Boolean startsWith(String string, char character) {

        char first = string.charAt(0);
        return first == character || first == character + 32 || first == character - 32;
    }
}
