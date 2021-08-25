package com.java.eight.streams.demos;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamDemo9 {
    public static void main(String[] args) {
        int reducedTwoParams =
                IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reducedTwoParams);

    }
}
