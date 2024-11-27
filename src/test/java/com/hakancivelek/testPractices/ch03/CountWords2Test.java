package com.hakancivelek.testPractices.ch03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CountWords2Test {
    @Test
    void counter(){

        // Last character check!
//        String responseMustBeOneForFirstR = "r try something"; // 1
//        String responseMustBeOneForFirstS = "s try something"; // 1
//        String responseMustBeOneForOneR = "r"; // 1
//        String responseMustBeOneForOneS = "s"; // 1

        String responseMustBeTwo = "Our efforts hope go to waste"; // 2
        String responseMustBeThree = "Stars shine brighter during nights"; // 3
        String responseMustBeFour = "Cars, trains, and buses are common means of transport"; // 4
        String responseMustBeFive = "The runners and players focus on their goals"; // 5

        CountWords2 countWords2 = new CountWords2();

        // Last character check!
//        assertThat(countWords2.count(responseMustBeOneForFirstR)).isEqualTo(1);
//        assertThat(countWords2.count(responseMustBeOneForFirstS)).isEqualTo(1);
//        assertThat(countWords2.count(responseMustBeOneForOneR)).isEqualTo(1);
//        assertThat(countWords2.count(responseMustBeOneForOneS)).isEqualTo(1);

        assertThat(countWords2.count(responseMustBeTwo)).isEqualTo(2);
        assertThat(countWords2.count(responseMustBeThree)).isEqualTo(3);
        assertThat(countWords2.count(responseMustBeFour)).isEqualTo(4);
        assertThat(countWords2.count(responseMustBeFive)).isEqualTo(5);
    }

    @Test
    void counterTwo(){
        int words = new CountWords().count("dogs cats");
        assertThat(words).isEqualTo(2);
    }
}
