package com.qa.day3;

public class ExercisesArrays {
   public static int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   public static int[] array2= new int[5];
    public static void main(String[]args) {

        for(int i: array1){
            System.out.println("Number: " + i);
        }

        for (int i=0; i<array2.length; i++){
            array2[i]=i;
            System.out.println("Number Array2: " + array2[i]);
        }
        for (int i=0; i<array2.length; i++){
            array2[i]=i*10;
            System.out.println("Number Array2 New: " + array2[i]);
        }

    }

}
