package com.qa.day3;

public class Exercise1Flowcharts {
    //prints numbers 1-10 10 times each
    public static void number(){
       for(int i=1; i<=10; i++){
           for(int j=0; j<10; j++){
               System.out.println(i);
           }
       }
    }
    //prints number as many times as the value of that number
    public static void number2(){
        for(int i=1; i<=10; i++) {
            for(int j=0; j<i; j++){
                System.out.println(i);
            }
        }
        }


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
        number();
        number2();
    }
}
