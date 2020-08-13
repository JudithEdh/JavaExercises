package com.qa.day2;

public class Exercise1 {

    public static void main(String[]args){
        int first=2;
        int second=4;
        int sum=sum(first,second);
        int subtract=subtract(first,second);
        double divide=divide(first, second);
        int multiply=multiply(first,second);
        System.out.println(first +" + "+ second+" = "+ sum);
        System.out.println(first +" - "+ second+" = "+ subtract);
        System.out.println(first +" * "+ second+" = "+ multiply);


    }
    public static int sum(int firstNumber, int secondNumber ){
        return (firstNumber+secondNumber);
    }
    public static int subtract(int firstNumber, int secondNumber ){
        return (firstNumber-secondNumber);
    }
    public static int multiply(int firstNumber, int secondNumber ){
        return (firstNumber*secondNumber);
    }
    public static double divide(double firstNumber, double secondNumber ){
        double result=0;
        if(firstNumber>=secondNumber){
             result=firstNumber/secondNumber;
            System.out.println(firstNumber +" / "+ secondNumber+" = "+ result);
        }else{
            System.out.println("The division cannot be performed");
            result=0;
        }
        return result;
    }
};


