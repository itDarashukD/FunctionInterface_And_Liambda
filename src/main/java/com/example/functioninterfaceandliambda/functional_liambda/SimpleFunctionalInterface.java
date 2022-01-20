package com.example.functioninterfaceandliambda.functional_liambda;

import java.util.function.Function;

public class SimpleFunctionalInterface {

    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }


        public static void main(String[] args) {
            Function<Integer, Integer> myFunction = MyMath::triple; //Function<Integer, Integer>здесь первый арг - то, что Функ интерефейс принемает, второй то, что ретурн
            Integer apply = myFunction.apply(5);
            System.out.println(apply);


            Function<String, Integer> stringToIntegerFunction = someString -> someString.length(); //принимает Стринг, возвр Интеджер
            Integer some = stringToIntegerFunction.apply("some");
            System.out.println(some);


            Function<Integer, Integer> isNegativeNumber = x -> {
                if (x > 0) {
                    return x;
                } else return 0;
            };
            Integer apply1 = isNegativeNumber.apply(-5);
            System.out.println(apply1);

            //or
            Function<Integer, Integer> isNegativeNumberWithTernalExpression =
                    (x) -> x > 0 ? x : x * x;
            Integer apply2 = isNegativeNumberWithTernalExpression.apply(5);
            System.out.println(apply2);


        }
    }


}















