package com.ejg.generic_classes;

public class Celebrations {
    public static void main(String[] args) {
        Gift<Book> gift = new Gift<>(new Book());
        gift.wrap();
    }
}
