package com.qa.day2;



public class Exercise8Numbers {

    static int  sum (int number){
        int secondDigit=number%10;
        System.out.println(secondDigit);
        int firstDigit=(number/10)%10;
        System.out.println(firstDigit);
        return firstDigit+secondDigit;
    }

    static String printNumber(int number){
       String word="";
        int firstDigit;
        int secondDigit;
      String numbersEnglish[][] = {{"one", "two","three","four","five","six","seven","eight","nine","ten"},
                                    {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"}};
        if(number<=10){
            word+=numbersEnglish[0][number-1];
        }else{
            if(number<20){
                switch (number){
                    case 11: word+="eleven";
                        break;
                    case 12: word+="twelve";
                        break;
                    case 13: word+="thirteen";
                        break;
                    case 14: word+="fourteen";
                        break;
                    case 15: word+="fifteen";
                        break;
                    case 16:
                        break;
                    case 17: word+="seventeen";
                        break;
                    case 18: word+="eighteen";
                        break;
                    case 19: word+="nineteen";
                        break;
                }
            }else {
                firstDigit = (number / 10) % 10;
                secondDigit = number % 10;
                if (secondDigit == 0) {
                    word += numbersEnglish[1][firstDigit - 2];
                } else {
                    word += numbersEnglish[1][firstDigit - 2] + numbersEnglish[0][secondDigit - 1];
                }
            }
        }

        return word;
    }

    public static void main(String[] args) {
        System.out.printf("The of the digits of 88 is %d %n", sum(88));
        System.out.printf("97 = %s",printNumber(97));

    }
}
