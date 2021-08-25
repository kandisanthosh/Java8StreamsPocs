package com.streamsdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsListToMapDemo2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(200, "Sohan"));
        list.add(new Person(300, "Mahesh"));
        Map<Integer,String> map=list.stream().collect(Collectors.toMap(Person::getId,Person::getName));
        map.forEach((a,b)->System.out.println("key"+a+"value"+b));

    }
}
 class Person {
    private Integer id;
    private String name;
    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}