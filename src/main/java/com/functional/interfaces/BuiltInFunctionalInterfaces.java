package com.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BuiltInFunctionalInterfaces implements Function<Integer, Integer> {

    public static void main(String[] args) {
        // Standalone function
        Function<Integer, Integer> pow = (value) -> {
            return value * value;
        };
        System.out.println(pow.apply(2));

        // Using the SquareFunction class that implements the Function Interface
        BuiltInFunctionalInterfaces builtInFunctionalInterface = new BuiltInFunctionalInterfaces();
        System.out.println(builtInFunctionalInterface.apply(3));

        // Predicate
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> filtered =
                list.stream().filter(value -> value >= 6).collect(Collectors.toList());
        System.out.println(filtered);
    }

    @Override
    public Integer apply(Integer value) {
        return value * value;
    }
}
