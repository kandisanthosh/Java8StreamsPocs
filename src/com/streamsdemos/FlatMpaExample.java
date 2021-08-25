package com.streamsdemos;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FlatMpaExample {
    public static void main(String[] args) {
        List<Books> books = Arrays.asList(new Books(10, "AAA"), new Books(20, "BBB"));
        Writer w1 = new Writer("Mohan", books);
        books = Arrays.asList(new Books(30, "XXX"), new Books(15, "ZZZ"));
        Writer w2 = new Writer("Sohan", books);
        List<Writer> writers = Arrays.asList(w1, w2);
        Books book = writers.stream().flatMap(writer -> writer.getBooks().stream())
                .max(new BookComparator()).get();
    }
}
class BookComparator implements Comparator<Books> {
    @Override
    public int compare(Books b1, Books b2) {
        if (b1.getPrice() > b2.getPrice()) {
            return 1;
        } else if (b1.getPrice() == b2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
class Books {
    private int price;
    private String name;
    public Books(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Writer {
    private String name;
    private List<Books> books;
    public Writer(String name, List<Books> books) {
        this.name = name;
        this.books = books;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Books> getBooks() {
        return books;
    }
    public void setBooks(List<Books> books) {
        this.books = books;
    }
}