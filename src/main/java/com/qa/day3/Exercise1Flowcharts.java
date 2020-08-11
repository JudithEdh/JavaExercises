package com.qa.day3;

public class Exercise1Flowcharts {
    public static void main(String[]args){
        //flowchart 1
        for (int A=100; A<=200;A++){
           System.out.println(A);
        }
       //flowchart 2
        for (int A=100;A<=200; A++){
            if((A%2)==0){
                System.out.println("-");
            }else{
                System.out.println("*");
            }
        }

    }
}
