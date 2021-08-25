package com.java.eight.streams.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo13 {

    public static void main(String[] args) {
        Stream.of(10, 20, 30).peek(e -> System.out.println(e))
                .collect(Collectors.toList());

        Stream.of(10, 20, 30).peek(e -> System.out.println(e));

        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
        String output = list.stream()
                .distinct()
                .peek(e -> System.out.println("Debug value: " + e))
                .collect(Collectors.joining(","));
        System.out.println(output);
    }
}
