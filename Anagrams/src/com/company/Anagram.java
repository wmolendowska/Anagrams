package com.company;

import java.util.Arrays;

public class Anagram {
    private String firstWord;
    private String secondWord;

    public Anagram(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public boolean checkIfAnagrams(){

        if (firstWord.length() < secondWord.length()){
            String temp = firstWord;
            firstWord = secondWord;
            secondWord = temp;
        }

       char firstWordArray[] = firstWord.toLowerCase().toCharArray();
        Arrays.sort(firstWordArray);
        char secondWordArray[] = secondWord.toLowerCase().toCharArray();


        firstWord = String.valueOf(firstWordArray);
        System.out.println(firstWord);

        for(int i = 0; i < secondWord.length(); i++){

            int x = Arrays.binarySearch(firstWord.toCharArray(), secondWordArray[i]);

            if (x < 0){
                return false;
            }

            if(x == 0){
                firstWord = firstWord.substring(x + 1);
            } else {
                firstWord = firstWord.substring(0, x) + firstWord.substring(x + 1);
            }

        }

        return true;
    }


}
