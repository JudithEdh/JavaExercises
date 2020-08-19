package com.qa.day7;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamsExercises {
    public static void main(String[] args) {

        List<String> exercise1= Arrays.asList("Michael", "Dean", "James", "Chris");
       /* List<String> solution1=
                exercise1.stream()
                        .map(x -> {
                            if (!x.equals("James")){
                                String.valueOf("Hello" + x);
                            }
                            else x;
                        }
                        .collect(Collectors.toList()); */

        exercise1.forEach(x -> {if (!x.equals("James"))
                                System.out.printf("%n Hello %s",x);
                                else System.out.printf("%n %s", x);});



        List<Integer> exercise2=Arrays.asList(3, 4, 7, 8, 12);
        int solution2=
                exercise2.stream()
                .reduce((a,b)->a*b)
                .get();
        System.out.println(solution2);





       List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
       /* names.stream()
                .forEach(x -> System.out.println(x)); */

        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square =
                number.stream()
                        .map(x -> x*x)
                        .collect(Collectors.toList());
        List<String> result =
                names.stream()
                        .filter(str -> str.startsWith("S"))
                        .collect(Collectors.toList());
        List<String> result2 =
                names.stream()
                        .sorted()
                        .collect(Collectors.toList());
        result2.stream()
                .forEach(x -> System.out.println(x));
        int even =
                number.stream()
                        .filter(x -> x % 2 == 0)
                        .reduce((a,b) -> a+b)
                        .get();

    }
}
