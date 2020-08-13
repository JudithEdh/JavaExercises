package com.qa.day5;

import java.util.Scanner;

public class PeerProgramming {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input text: ");
            String input = scanner.next();//
            System.out.println("=============================");
            System.out.println("=========Test_1==============");
            System.out.println(encode(input));
            System.out.println("=============================");
            System.out.println("=========Test_2==============");
            System.out.println(encode("draziw"));

            System.out.println("=============================");
            System.out.println("=========Test_3==============");
            System.out.println(encode("dra  ziw"));
            //ans = draziw
            //reverse();
        }
        /*
            public String cypher(char[][]){
            }
            */
        public static void reverse(){
            char[] alphabet = {'a','b','c','d','e','f','g','h','i',
                    'j','k','l','m','n','o','p','q','r','s','t','u',
                    'v','w','x','y','z'};
            for(int i = alphabet.length-1; i >-1 ; i--){
                System.out.print("'"+alphabet[i]+"'" + ",");
            }
        }
        public static String encode(String beforeCypher){
            String encryedString = beforeCypher.toLowerCase();
            char[] alphabet = {'a','b','c','d','e','f','g','h','i',
                    'j','k','l','m','n','o','p','q','r','s','t','u',
                    'v','w','x','y','z', ' '};
            char[] alphabetReverse = {'z','y','x','w','v','u','t','s','r','q','p',
                    'o','n','m','l','k','j','i','h','g','f','e','d','c','b','a', ' '};

            String outString = "";
            for(int i = 0; i< encryedString.length(); i++){
                char c = encryedString.charAt(i);
            }
            char[] encryedStringAsCharArray  = encryedString.toCharArray();

            for(char c: encryedStringAsCharArray){
                for(int a = 0; a < alphabet.length; a++){
                    if(c == alphabet[a]){
                        outString += alphabetReverse[a];

                    }
                }
            }
            return outString;
        }
    }

