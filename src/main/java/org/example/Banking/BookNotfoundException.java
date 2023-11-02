package org.example.Banking;

public class BookNotFoundException extends Exception {
    public BookNotFoundException() {
        super("Book not found in catalog");
    }
}