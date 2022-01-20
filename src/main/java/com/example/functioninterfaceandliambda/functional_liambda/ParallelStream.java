package com.example.functioninterfaceandliambda.functional_liambda;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ParallelStream {

    public static void main(String[] args) {

        String [] arrayOfStrings = {"dddddd","aaaaaaa","sssssssss","eeeeee","qqqqqqqqq"};
        List<String >stringList = Arrays.asList(arrayOfStrings);

        List<String> collect = stringList.parallelStream()
                .map(word -> {
                    System.out.println(" processing... " + word);
                    return word.toUpperCase(Locale.ROOT);
                })
                .map(word -> {
                    System.out.println("add exclamation sign " + word);
                    return word + " !";
                })
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
