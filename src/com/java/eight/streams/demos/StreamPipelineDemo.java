package com.java.eight.streams.demos;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineDemo {

    public static void main(String[] args) {
        Stream<String> onceMOdified=Stream.of("santhosh","kandi","rajesh").skip(1);
        onceMOdified.collect(Collectors.toList()).forEach(e->System.out.println(e));
       // onceMOdified.filter(e->e.equals("santhosh")).forEach(e->System.out.println(e));

    }
}
