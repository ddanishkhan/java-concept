package org.java.learnings.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class NumbersInSequence {
    public static void main(String[] args) {

        AtomicInteger count = new AtomicInteger(1);
        int MAX = 100;
        var printer = new Runnable() {
            @Override
            public void run() {
                synchronized (count) {
                    while (true) {
                        int num = count.getAndIncrement();
                        if (num > MAX) {
                            count.notifyAll();
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + " " + num);
                        count.notifyAll();
                        try {
                            count.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        var t1 = new Thread(printer);
        var t2 = new Thread(printer);
        var t3 = new Thread(printer);

        t1.start();
        t2.start();
        t3.start();
    }
}
