package com.qa.day2;

public class Exercise4Flowcharts {
    public static void flow(int A){
        if(A>2000){
            System.out.println("A");
            if(A>6000){
                System.out.println("C");
            }else{
                System.out.println("B");
                if(A>4000){
                    System.out.println("D");
                }else{
                    System.out.println("E");
                }
            }
        }
    }
}
