package com.practise.core.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodrefernceonList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Harshad");
        names.add("Deepak");

        names.forEach(System.out::println);
    }
}
