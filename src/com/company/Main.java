package com.company;

import ibcsutils.Book;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(6, 7);
        Point b = new Point(100, 101);


    }

    public static void example() {
        User jarmo = new User("Jarmo", "Hurri", "good question", 0);
        System.out.println(jarmo.toString());
    }

    public static void homework2() {
        Book[] books = new Book[2];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(String.valueOf((char) (i + 97)), new String[]{"Jarmo", "Jorma"}, i);
        }

        System.out.println(Arrays.toString(books));
    }
}
