package com.functional.interfaces;

public class UseFoo {

    private String value = "Enclosing scope value";

    @java.lang.FunctionalInterface
    public interface Foo {
        String method(String string);
    }

    public String scopeExperiment() {
        // Anonymous Class Implementation
        Foo fooIC = new Foo() {
            String value = "Inner class value";

            @Override
            public String method(String input) {
                return input + " " + this.value;
            }
        };
        String resultIC = fooIC.method("Inner Class UC");

        Foo fooLambda = (input) -> {
            String value = "Lambda value";
            return input + " " + this.value;
        };
        String resultLambda = fooLambda.method("Lambda UC");

        return "Results: resultIC = " + resultIC +
                ", resultLambda = " + resultLambda;
    }

    public static void main(String[] args) {
        UseFoo useFoo = new UseFoo();
        System.out.println(useFoo.scopeExperiment());
    }
}
