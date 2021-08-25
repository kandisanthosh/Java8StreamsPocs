package com.java.eight.streams.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40);
        Integer[] intarray=list.stream().map(e->e*2).toArray(Integer[]::new);
        for (int number:intarray){
            System.out.println(number);
        }

        //In this example we will convert stream of integer into array of integer.
        Object[] objArray = Stream.of(10, 20, 30, 40).toArray();
        Integer[] intArray = Arrays.copyOf(objArray, objArray.length, Integer[].class);

        for(Integer i : intArray) {
            System.out.println(i);
        }
    }
}
