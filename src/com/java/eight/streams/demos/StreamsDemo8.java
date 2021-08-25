package com.java.eight.streams.demos;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo8 {
    public static void main(String[] args) {
        List<String> list= Stream.of("santhosh","kandi","rajesh").collect(Collectors.toList());
        Optional<String> stream = list.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();
    }
}
