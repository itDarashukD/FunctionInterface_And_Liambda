package com.example.functioninterfaceandliambda.functional_liambda.manyArgsOrNoArgs;

import java.util.function.BiFunction;

public class BiFunctionalInterface {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction =
                (x, y) -> x + y;
        Integer apply = biFunction.apply(3, 6);
        System.out.println(apply);


        NoArgsFunction<String> noArgsFunction = () -> "some String";  //ФИ без аргументов
        System.out.println(noArgsFunction.apply());



        TriArgFunction<Integer,Integer,Integer,String>triArgFunction =  //ФИ с многими арг, последный арг - ретурн тип
                (x,y,z)->String.valueOf(x+y+z);
        System.out.println(triArgFunction.apply(1,3,7));

    }


}
