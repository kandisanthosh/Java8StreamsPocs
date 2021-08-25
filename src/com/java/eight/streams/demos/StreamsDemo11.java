package com.java.eight.streams.demos;

import java.util.stream.Stream;

public class StreamsDemo11 {
    //forEach
    public static void main(String[] args) {
        Stream.of("A","B","C", "D")
                .parallel()
                .forEach(e -> System.out.println(e));

        //forEachOrdered

        Stream.of("A","B","C", "D")
                .parallel()
                .forEachOrdered(e -> System.out.println(e));
    }
}
