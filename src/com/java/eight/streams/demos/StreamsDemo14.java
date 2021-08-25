package com.java.eight.streams.demos;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo14 {
    public static void main(String[] args) {
        System.out.println("---Min and Max for Integer---");
        List<Integer> numList = Arrays.asList(42, 44, 43, 41);

        //For min
        numList.stream().reduce(Integer::min).ifPresent(s -> System.out.println(s)); //41
        //For max
        numList.stream().reduce(Integer::max).ifPresent(s -> System.out.println(s)); //44

        System.out.println("---Min and Max for String---");
        List<String> list = Arrays.asList("Mohit", "Nilesh", "Shankar", "Brajesh");


        list.stream().reduce((a,b)->{
            if(a.compareTo(b)<=0){
                return a;
            }
            return b;
        }).ifPresent(s -> System.out.println(s));
    }
}
