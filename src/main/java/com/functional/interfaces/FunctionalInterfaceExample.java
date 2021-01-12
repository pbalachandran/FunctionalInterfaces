package com.functional.interfaces;


public class FunctionalInterfaceExample {

    public interface  FunctionalInterface {
        public String singleAbstractMethod(String name);
    }

    public String greeting(FunctionalInterface functionalInterface, String name) {
        return functionalInterface.singleAbstractMethod(name);
    }

    public static void main(String[] args) {
        // Anonymous
        FunctionalInterface anonymousFunctionalInterfaceImpl = new FunctionalInterface() {
            // Allowed to have internal state values
            private String additionalMessage = ", how are you?";
            @Override
            public String singleAbstractMethod(String name) {
                return "Hello " + name + additionalMessage;
            }
        };
        System.out.println(anonymousFunctionalInterfaceImpl.singleAbstractMethod("Geetha"));

        // Lamdas
        // Standalone
        FunctionalInterface functionalInterfaceImpl = (name) -> {
            return "Hello " + name;
        };
        System.out.println(functionalInterfaceImpl.singleAbstractMethod("Pradeep"));

        // Via the greeting()
        System.out.println(new FunctionalInterfaceExample().greeting(functionalInterfaceImpl, "Vinay"));

        // Via the greeting(), but inline
        System.out.println(new FunctionalInterfaceExample().greeting((name) -> {
            return "Hello " + name;
        }, "Viji"));
    }
}


