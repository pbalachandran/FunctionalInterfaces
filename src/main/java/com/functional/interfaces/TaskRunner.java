package com.functional.interfaces;

import java.time.LocalDateTime;
import java.util.Date;

public class TaskRunner {

    private static volatile int number;
    private static volatile boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }

            System.out.println(number);
            System.out.println("End Time: " + LocalDateTime.now());
        }
    }

    public static void main(String[] args) {
        System.out.println("Start Time: " + LocalDateTime.now());
        new Reader().start();
        number = 42;
        ready = true;
    }
}