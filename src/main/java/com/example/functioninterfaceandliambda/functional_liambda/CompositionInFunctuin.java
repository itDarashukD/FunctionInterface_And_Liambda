package com.example.functioninterfaceandliambda.functional_liambda;

import java.util.function.Function;

public class CompositionInFunctuin {
    public static void main(String[] args) {

        Function<Integer, Integer> plus2 = x -> x + 2;
        Function<Integer, Integer> multiply3 = x -> x * 3;

        Function<Integer, Integer> result = multiply3.andThen(plus2);
        Function<Integer, Integer> result2 = plus2.andThen(multiply3); //result != result2
        
        Function<Integer, Integer> result3 = multiply3.compose(result2);

        System.out.println(result.apply(2));
        System.out.println(result2.apply(2));
        System.out.println(result3.apply(2));


    }


}
