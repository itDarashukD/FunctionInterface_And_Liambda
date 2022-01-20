package com.example.functioninterfaceandliambda.functional_liambda.streamsAndLiambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        Integer[] numbers = {3, 5, 2, 7, 9, 3, 44, 57, 98, 90, 43};
        List<Integer> numbersList = Arrays.asList(numbers);

        Predicate<Integer> predicateIsTrue = x -> x % 2 == 0; //Predicate<Integer> predicate - take a type T , and always return Boolean!

        List<Integer> collect = numbersList.stream()
                .filter(predicateIsTrue)
                .collect(java.util.stream.Collectors.toList());

        System.out.println(collect);
        //_________________________________________________________

        Set<Integer> collect1 = numbersList.stream()
                .filter(predicateIsTrue)
                .collect(Collectors.toSet());
        //_________________________________________________________

        String stringWithDelimiter = numbersList.stream()  //joining add delimiter
                .filter(predicateIsTrue)
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining("-- "));
        System.out.println(stringWithDelimiter);
        //_________________________________________________________
        Long collect2 = numbersList.stream()  //couting return count of values
                .filter(predicateIsTrue)
                .collect(Collectors.counting());
        //_________________________________________________________

        Map<Integer, List<String>> integerListMap = numbersList.stream()  //groupingBy return  Map<Integer, List<String>>
                .map(x -> String.valueOf(x))
                .collect(Collectors.groupingBy(
                        word -> word.length() // group by word length
                ));
        System.out.println(integerListMap);

        //_________________________________________________________

        Map<Boolean, List<Integer>> collectBooleanAndList = numbersList.stream()  //partitioningBy return   Map<Boolean, List<Integer>> , work such a Predicate, that return Boolean
                .collect(Collectors.partitioningBy(
                        digit -> digit > 5
                ));
        System.out.println(collectBooleanAndList);

    }
}