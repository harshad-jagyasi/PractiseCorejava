package com.practise.core.logic;

public class Factorial {

    static int factorial(int n){
        return (n==0 || n==1) ? 1 : n*factorial(n-1);
    }

    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }
}
