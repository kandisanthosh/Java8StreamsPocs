package com.java.eight.streams.demos;

import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//  Lazy Invocation
public class StreamDemo7 {
    public static void main(String[] args) {
        long counter;
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled(counter);
            return element.contains("2");
        });
    }
    private static void wasCalled(long counter) {
        counter++;
    }
}
