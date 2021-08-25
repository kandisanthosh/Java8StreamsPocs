package com.java.eight.streams.demos;

import com.sun.tools.javac.Main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo18 {
    public static void main(String[] args) {
        Stream<String> stream1=Stream.of("santosh","kandi","ramu","jyothi");
        Stream<String> stream2=Stream.of("sathsh","kandi","ramu","jyothi");
        Stream<String> streamConcatination=Stream.concat(stream1,stream2).distinct();
        streamConcatination.forEach(e->System.out.print(e+" "));
    }
}
