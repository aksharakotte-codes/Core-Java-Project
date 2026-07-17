package com.multithreading;

public class AvoidDeadLock {

    public static void main(String[] args) {

        System.out.println("Main Method Started!!");

        final String resource1 = "Akshara";
        final String resource2 = "Akhi";

        Thread t1 = new Thread(() -> {

                synchronized (resource1) {
                    System.out.println("Thread 1 : Locked Resource 1");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1 : Locked Resource 2");
                    }
                }
        });
        Thread t2 = new Thread(() -> {

                // Same lock order as Thread 1
                synchronized (resource1) {
                    System.out.println("Thread 2 : Locked Resource 1");

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 2 : Locked Resource 2");
                    }
                }
        });

        t1.start();
        t2.start();

        System.out.println("Main Method Ended!!");
    }
}