package com.functional.interfaces;

import java.util.function.Function;

public class LambdaFunction {


    public static void main(String[] args) {
        LambdaFunction.print("Pradeep");
    }

    private static void print(String input) {
        Function<String, String> foo = parameter -> "Hello " + parameter + "!";

        System.out.println(foo.apply(input));
    }
}
