package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First word: ");
        String firstWord = scanner.next();
        System.out.println("Second word: ");
        String secondWord = scanner.next();

        Anagram anagram = new Anagram(firstWord, secondWord);
        if (anagram.checkIfAnagrams()){
            System.out.println(firstWord + " and " + secondWord + " are anagrams.");
        } else {
            System.out.println(firstWord + " and " + secondWord + " are not anagrams.");
        }

    }

}
