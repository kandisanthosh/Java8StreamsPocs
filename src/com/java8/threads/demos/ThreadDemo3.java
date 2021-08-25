package com.java8.threads.demos;

public class ThreadDemo3 extends Thread{
    @Override
    public  void start() {
     System.out.print("start method overriden");
    }

    @Override
    public void run() {
        System.out.print("run method overriden");
    }

    public static void main(String[] args) {
        ThreadDemo3 demo3=new ThreadDemo3();
        demo3.start();
    }
}
