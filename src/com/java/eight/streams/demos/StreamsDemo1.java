package com.java.eight.streams.demos;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo1 {
    public static void main(String[] args) {

        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        Stream<Integer> streamBuilderForInteger=Stream.<Integer>builder().add(1234567).build();
        System.out.println("streamBuilderForInteger: "+streamBuilderForInteger);
        System.out.println("IntegerStreamRange: "+ IntStream.of(123,3213,321421,1243243,123));
        Stream<String> streamGenerated=Stream.generate(()->"santhosh").limit(10);
        System.out.println("streamGenerated: "+streamGenerated);
        Stream<Integer> StreamIterated=Stream.iterate(40,n->n+1).limit(20);
        System.out.println("StreamIterator: "+StreamIterated);

    }
}
