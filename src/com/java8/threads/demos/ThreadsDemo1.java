package com.java8.threads.demos;

public class ThreadsDemo1 extends Thread {


    @Override
    public void run() {
        this.currentThread().setPriority(10);
        System.out.println("child thread executed");
    }

    public static void main(String[] args) {
        ThreadsDemo1 demo1 = new ThreadsDemo1();
        demo1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread executed");

        }
    }

}
