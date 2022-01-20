package com.example.functioninterfaceandliambda.functional_liambda.manyArgsOrNoArgs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {
        Integer[] numbers = {3, 5, 2, 7, 9, 3, 44, 57, 98, 90, 43};
        List<Integer> numbersList = Arrays.asList(numbers);

        Predicate<Integer> predicateIsTrue = x -> x % 2 == 0; //Predicate<Integer> predicate - take a type T , and always return Boolean!

        List<Integer> collect = numbersList.stream()
                .filter(predicateIsTrue)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
