package com.practise.core.logic;

public class Fibonacci {

    static int fibo(int i){
        if(i<=1)
            return i;

        return fibo(i-1) + fibo(i-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(9));
    }
}
