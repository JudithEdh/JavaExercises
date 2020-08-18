package com.qa.day3;

public class StringManipulation {
    static int findNumberWords(String word){
        int numberOfWords=1;
        int i=0;
        while(i<word.length()){
        if((word.substring(i,i+1)).equals(" ")){
            numberOfWords++;
        }
        i++;
        }
        return numberOfWords;
    }
    static void printWordsVertically(String word){
        int i=0;
        int nextWordPosition=0;

        while(i<word.length()){
            if((word.substring(i,i+1)).equals(" ")){
                System.out.println((word.substring(nextWordPosition,i)));
                nextWordPosition=i+1;
            }
            i++;

        }
        System.out.println((word.substring(nextWordPosition,i)));
    }
    public static void main(String[] args) {
    System.out.printf("There are %d words %n",findNumberWords("3 jo words"));
    printWordsVertically("there are so many");
    }
}
