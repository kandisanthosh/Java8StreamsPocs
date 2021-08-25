package com.java.eight.streams.demos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream pipeline examples
public class StreamsDemo6 {
    public static void main(String[] args) {
        List<String> list=  Stream.of("santhosh","kandi","sathish","rajesh").collect(Collectors.toList());
       System.out.println("count"+ list.stream().skip(1).map(e->e.substring(0,3)).count());
        list.stream().forEach(e->System.out.println("names list "+e));
    }
}
