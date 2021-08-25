package com.java.eight.streams.demos;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamsDemo3 {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("a","b","c","d").filter(e->e.contains("c"));
        Optional<String> anyELement=stream.findAny();
        if(!anyELement.isEmpty()){
            System.out.print("not empty stream");
        }
    }
}
