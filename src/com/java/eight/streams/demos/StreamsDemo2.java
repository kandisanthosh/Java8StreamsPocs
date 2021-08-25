package com.java.eight.streams.demos;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo2 {

    public static void main(String[] args) {
        Path filePath= Paths.get("C:\\Users\\kandi\\OneDrive\\Desktop\\LIC docs.txt");
        try (Stream<String> lines = Files.lines(filePath)) {
     lines.forEach(e->System.out.println(e));
        }
        catch (Exception e){

        }
    }
}
