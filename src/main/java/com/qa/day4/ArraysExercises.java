package com.qa.day4;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] exercise = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("%d %d %d %d %d %d %d %d %d %d %n",exercise[0], exercise[1], exercise[2], exercise[3], exercise[4],
                exercise[5], exercise[6], exercise[7], exercise[8], exercise[9]);
        for(int i=0; i< exercise.length; i++ ){
            exercise[i]=10-i;
            System.out.printf("%d ",exercise[i]);
        }
        System.out.println();
        for(int i=0; i< exercise.length; i++ ){
            exercise[i]=10*exercise[i];
            System.out.printf("%d ",exercise[i]);
        }

    }
}
