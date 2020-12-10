package com.practise.core.logic;

public class ThreadByImplementingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running by implementing Runnable");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadByImplementingRunnable());
        t1.start();
    }
}

