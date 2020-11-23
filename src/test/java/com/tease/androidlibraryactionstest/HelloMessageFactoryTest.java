package com.tease.androidlibraryactionstest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HelloMessageFactoryTest {
    private HelloMessageFactory factory;

    @Before
    public void setUp() {
        factory = new HelloMessageFactory("Hello world!");
    }

    @Test
    public void message() {
        String message = factory.message();
        assertEquals(message, "Hello world!");
    }
}