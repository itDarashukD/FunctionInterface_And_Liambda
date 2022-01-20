package com.example.functioninterfaceandliambda.functional_liambda.manyArgsOrNoArgs;

public interface TriArgFunction <T,S,K,R> { //четвертый аргумент  - возвращаемый тип
    R apply(T t,S s,K k);
}
