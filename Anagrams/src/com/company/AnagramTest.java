package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class AnagramTest {

    private String firstWord;
    private String secondWord;
    private boolean expected;

    private Anagram anagram;

    public AnagramTest(String firstWord, String secondWord, boolean expected) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        anagram = new Anagram(firstWord, secondWord);
    }

    @Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][] {
            {"Aktor", "kotka", false},
            {"jazda", "zjada", true},
            {"aktor", "kot", false},
            {"kot", "kto", true},
            {"wola", "ola", false}
        });
    }

    @Test
    public void checkAnagrams(){
        System.out.println(firstWord + " " + secondWord);
        assertEquals(anagram.checkIfAnagrams(), expected);
    }


}
