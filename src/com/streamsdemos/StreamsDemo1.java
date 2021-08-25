package com.streamsdemos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamsDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(3, "Nilesh", 10));

        list.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e.getName()));
        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()));
        list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()));

    }
}

