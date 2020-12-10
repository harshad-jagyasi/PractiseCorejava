package com.practise.core.logic;

public class VolatileExample extends Thread {
    private volatile int counter = 0;
    private final static int noOfThreads = 2;
    VolatileExample vEx = new VolatileExample();

    /*public VolatileExample(VolatileExample vEx){
        this.vEx=vEx;
    }*/

    public int getCounter(){
        return counter;
    }

    public void increaseCounter(){
        counter++;
    }

    @Override
    public void run() {
        int oldValue = vEx.getCounter();
        System.out.println("Thread " + Thread.currentThread().getName() + ": Old Value " + oldValue);
        vEx.increaseCounter();
        int newValue = vEx.getCounter();
        System.out.println("Thread " + Thread.currentThread().getName() + ": New Value " + newValue);
    }

    public static void main(String[] arg) throws InterruptedException{
        Thread[] thread = new Thread[noOfThreads];
        for(int i=0 ; i<2 ; i++)
            thread[i] = new VolatileExample();
        for(int i=0 ; i<2 ; i++)
            thread[i].start();
        for(int i=0 ; i<2 ; i++)
            thread[i].join();
        
    }
}