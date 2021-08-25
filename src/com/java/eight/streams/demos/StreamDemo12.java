package com.java.eight.streams.demos;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo12 {
    public static void main(String[] args) {
        List<Integer> numList= Stream.of(42,43,44,45,46).collect(Collectors.toList());

        Comparator<Integer> comparator=Comparator.comparing(Integer::intValue);

        Optional<Integer> minOptional=numList.stream().min(comparator);
        minOptional.ifPresent(e -> System.out.println("Min: " + e));

        Optional<Integer> maxOptional = numList.stream().max(comparator);
        maxOptional.ifPresent(e -> System.out.println("Max: " + e));

        System.out.println("---Min and Max for String---");

        List<String> list = Arrays.asList("Mohit", "Nilesh", "Shankar", "Brajesh");

        list.stream().min(Comparator.comparing(String::valueOf)).
                ifPresent(e -> System.out.println("Min: " + e));

        list.stream().sorted(Comparator.comparing(String::valueOf)).forEach(
                (e -> System.out.println("Min: " + e)));

    }
}
