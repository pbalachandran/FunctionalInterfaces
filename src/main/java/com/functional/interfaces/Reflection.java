package com.functional.interfaces;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reflection {

    public class Person {
        private String name;
        private int age;
    }

    public void test() {
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();
        List<String> actualFieldNames = getFieldNames(fields);

        boolean isContained = actualFieldNames.containsAll(Arrays.asList("name", "age"));
        System.out.println("isContained " + isContained);
    }

    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields) {
            fieldNames.add(field.getName());
        }
        return fieldNames;
    }

    public static void main(String[] args) {
        new Reflection().test();
    }
}
