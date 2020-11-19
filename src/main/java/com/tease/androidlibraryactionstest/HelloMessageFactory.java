package com.tease.androidlibraryactionstest;

public class HelloMessageFactory {
    private final String message;

    public HelloMessageFactory(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
