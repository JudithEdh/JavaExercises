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

    static void printWordsVertically2(String word){
        int i=word.length();
        int nextWordPosition=word.length();

        while(i>0){
            if((word.substring(i-1,i)).equals(" ")){
                System.out.println((word.substring(i,nextWordPosition)));
                nextWordPosition=i-1;
            }
            i--;

        }
        System.out.println((word.substring(i,nextWordPosition)));
    }

    static void findWord(String word, String word2){
        int i=0;
        int nextWordPosition=0;

        while(i<word.length()){
            if((word.substring(i,i+1)).equals(" ")){
                if((word.substring(nextWordPosition,i)).equals(word2)){
                System.out.println((word.substring(nextWordPosition,i)));
                }
                nextWordPosition=i+1;
            }
            i++;

        }

    }

    public static void main(String[] args) {
    System.out.printf("There are %d words %n",findNumberWords("3 jo words"));
    printWordsVertically("there are so many");
    printWordsVertically2("there are so many");
        findWord("love is something beautiful", "love");
    }
}
