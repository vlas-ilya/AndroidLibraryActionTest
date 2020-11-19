package com.tease.androidlibraryactionstest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloMessageFactoryTest {
    private HelloMessageFactory factory;

    @BeforeEach
    void setUp() {
        factory = new HelloMessageFactory("Hello world!");
    }

    @Test
    void message() {
        String message = factory.message();
        assertEquals(message, "Hello world!1");
    }
}