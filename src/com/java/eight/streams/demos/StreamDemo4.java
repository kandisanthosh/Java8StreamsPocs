package com.java.eight.streams.demos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<String> elements= Stream.of("santhosh","sampath","sager","sravs").collect(Collectors.toList());
        elements.stream().findAny();
        elements.stream().findFirst();
        elements.stream().forEach(e->System.out.println(e));
    }
}
