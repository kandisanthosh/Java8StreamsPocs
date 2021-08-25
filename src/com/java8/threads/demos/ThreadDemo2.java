package com.java8.threads.demos;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("main thread executed");
    }

    public static void main(String[] args) {
        ThreadDemo2 demo2=new ThreadDemo2();
        Thread thread=new Thread(demo2);
        thread.start();
        Thread thread1=new Thread(demo2);
        thread1.start();

    }
}
