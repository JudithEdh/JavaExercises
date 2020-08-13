package com.qa.day2;

public class Exercise3 {



        public static int  input(int number1, int number2, boolean value) {
            int result;
            if(value){
                result=number1+number2;
            }else{
                result=number1*number2;
            }
            return result;
        };

    public static void main(String[]args){
      int a = input(3, 4, false);
        System.out.println("Your result is " + a);
    }

}
