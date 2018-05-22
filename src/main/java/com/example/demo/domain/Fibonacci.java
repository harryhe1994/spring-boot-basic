package com.example.demo.domain;

public class Fibonacci {
    private Fibonacci(){}
    public static int of(int num) {
        if(num > 2) {
            return of(num - 2) + of(num - 1);
        }
        return 1;
    }
}
