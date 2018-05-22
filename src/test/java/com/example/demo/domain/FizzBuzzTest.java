package com.example.demo.domain;

import org.junit.*;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_return_fizz_when_given_3_for_fizzBuzz() {
        Assert.assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void should_return_buzz_when_given_5_for_fizzBuzz() {
        Assert.assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void should_return_fizz_buzz_when_given_15_for_fizzBuzz() {
        Assert.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void should_return_4_when_given_4_for_fizzBuzz() {
        Assert.assertEquals("4",FizzBuzz.fizzBuzz(4));
    }
}