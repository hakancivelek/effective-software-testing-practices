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

        /*
         * When we run CountWordsTest2's counter test with coverage, we will notice that this if condition is not covered.
         * If we uncomment the comment lines under // Last character check!, we will see that this part is also covered.
         */
        if (last == 'r') {
            wordCount++;
        } else if (last == 's') {
            wordCount++;
        }



        return wordCount;
    }
}
