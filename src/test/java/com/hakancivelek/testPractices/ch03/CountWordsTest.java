package com.hakancivelek.testPractices.ch03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountWordsTest {
    @Test
    void counter(){

        String responseMustBeOneForFirstR = "r try something"; // 1
        String responseMustBeOneForFirstS = "s try something"; // 1
        String responseMustBeOneForOneR = "r"; // 1
        String responseMustBeOneForOneS = "s"; // 1
        String responseMustBeTwo = "Our efforts hope go to waste"; // 2
        String responseMustBeThree = "Stars shine brighter during nights"; // 3
        String responseMustBeFour = "Cars, trains, and buses are common means of transport"; // 4
        String responseMustBeFive = "The runners and players focus on their goals"; // 5

        CountWords countWords = new CountWords();

        assertThat(countWords.count(responseMustBeOneForFirstR)).isEqualTo(1);
        assertThat(countWords.count(responseMustBeOneForFirstS)).isEqualTo(1);
        assertThat(countWords.count(responseMustBeOneForOneR)).isEqualTo(1);
        assertThat(countWords.count(responseMustBeOneForOneS)).isEqualTo(1);
        assertThat(countWords.count(responseMustBeTwo)).isEqualTo(2);
        assertThat(countWords.count(responseMustBeThree)).isEqualTo(3);
        assertThat(countWords.count(responseMustBeFour)).isEqualTo(4);
        assertThat(countWords.count(responseMustBeFive)).isEqualTo(5);
    }

    @Test
    void counterTwo(){
        int words = new CountWords().count("dogs cats");
        assertThat(words).isEqualTo(2);
    }
}