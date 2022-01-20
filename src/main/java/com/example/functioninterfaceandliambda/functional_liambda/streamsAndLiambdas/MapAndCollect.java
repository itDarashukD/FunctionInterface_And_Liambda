package com.example.functioninterfaceandliambda.functional_liambda.streamsAndLiambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapAndCollect {

    public static void main(String[] args) {
        Integer[] numbers = {3, 5, 2, 7, 9, 3, 44, 57, 98, 90, 43};
        List<Integer> numbersList = Arrays.asList(numbers);

        Function<Integer, Integer> function = x -> x * 2;

        List<Integer> collect = numbersList.stream()
                .map(function)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
