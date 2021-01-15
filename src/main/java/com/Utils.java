package com;

public class Utils {
    public String concatenateWords(String word1, String word2) {
        return word1 + word2;
    }

    public int computeFactorial(int value) {
        int valueForMultiple = value-1;

        while (valueForMultiple > 0) {
            value = value * valueForMultiple--;
        }
        return value;
    }
}
