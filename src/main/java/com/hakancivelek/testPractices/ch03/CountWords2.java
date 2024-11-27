package com.hakancivelek.testPractices.ch03;

public class CountWords2 {
    public int count(String str) {
        int wordCount = 0;
        char last = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) && (last == 's' || last == 'r')) {
                wordCount++;
            }

            last = str.charAt(i);
        }

        if (last == 'r') {
            wordCount++;
        } else if (last == 's') {
            wordCount++;
        }

        return wordCount;
    }
}
