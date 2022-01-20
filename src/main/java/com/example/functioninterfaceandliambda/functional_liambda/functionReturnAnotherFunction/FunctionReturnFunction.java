package com.example.functioninterfaceandliambda.functional_liambda.functionReturnAnotherFunction;


import com.example.functioninterfaceandliambda.functional_liambda.manyArgsOrNoArgs.NoArgsFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionReturnFunction {

    private static Function<Integer, Integer> multiply(Integer y) {
        return (Integer x) -> x * y;
    }

    public static void main(String[] args) {

        NoArgsFunction<NoArgsFunction<String>> functionInFunction = () -> () -> "hello"; //FI that invoke another FI that invoke string "hello
        NoArgsFunction<String> greater = functionInFunction.apply();
        System.out.println(greater.apply());
//========================================================================
        Function<Integer, Integer> times2 = multiply(5);
        System.out.println(times2.apply(2));

        Function<Integer, Integer> times3 = multiply(7);
        System.out.println(times3.apply(2));
//=========================================================================

        NoArgsFunction<NoArgsFunction<String>> functionInFunc = () -> {  //with local variable name
            String name = "Dzmitry";
            return () -> "hello from" + name;
        };

        NoArgsFunction<String> apply = functionInFunc.apply();
        System.out.println(apply.apply());
    }

//===========================================================================

    BiFunction<Integer, Integer, Integer> devideFunction = (x, y) -> x / y;


}