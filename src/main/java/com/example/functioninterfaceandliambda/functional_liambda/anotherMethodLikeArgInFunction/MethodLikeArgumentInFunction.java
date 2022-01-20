package com.example.functioninterfaceandliambda.functional_liambda.anotherMethodLikeArgInFunction;

import java.util.function.BiFunction;

public class MethodLikeArgumentInFunction { //we can to use like a arguments in FunctionInterface methods and liambdas

    public static Integer sum(int x, int y) {
        return x + y;
    }

    public static Integer substruct(int x, int y) {
        return x - y;
    }
    public static Integer substruc1t(int x, int y,int z) {
        return x - y;
    }

    public static Integer combine2and3(BiFunction<Integer, Integer, Integer> biFunctionalInterface) {
        return biFunctionalInterface.apply(2, 3);
    }

    public static void main(String[] args) {
        System.out.println(MethodLikeArgumentInFunction.combine2and3(MethodLikeArgumentInFunction::sum)); //work because i try to ingect method with 2 arg
        System.out.println(MethodLikeArgumentInFunction.combine2and3(MethodLikeArgumentInFunction::substruct));
//        MethodLikeArgumentInFunction.combine2and3(MethodLikeArgumentInFunction::substruc1t);  //do not work because i try to ingect method with 3 arg
        System.out.println(MethodLikeArgumentInFunction.combine2and3((x, y) -> x * 2 + y * 2));  //inject liambda
    }

}
