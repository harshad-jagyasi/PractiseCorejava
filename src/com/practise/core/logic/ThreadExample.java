package com.practise.core.logic;

public class ThreadExample extends Thread {
    public void run(){
        System.out.println("thread running");
    }

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
    }
}
