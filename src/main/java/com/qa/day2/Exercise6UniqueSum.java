package com.qa.day2;

public class Exercise6UniqueSum {

    static int uniqueSum(int a, int b, int c){
        int sum=0;
        if( (a!=b) && (a!=c) && (b!=c) ){
            sum=a+b+c;
        }else if( (a==b) && (a==c) && (b==c) ){
            sum=0;
        }else if (a==b){
            sum=c;
        }else if (a==c){
            sum=b;
        }else if (b==c){
            sum=a;
        }
        return sum;
    }
    public static void main(String[]args){
        System.out.println(uniqueSum(1,1,2));

    }
}
