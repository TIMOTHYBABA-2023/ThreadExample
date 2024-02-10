package org.example;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ThreadChallenge threadChallenge = new ThreadChallenge();

        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);

        CustomThread customThread = new CustomThread();


        Runnable runnable = () -> {
            for (int i = 1; i <= 8; i++){
                System.out.println(" 22222 ");

                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread myThread = new Thread(runnable);
        myThread.start();
        threadChallenge.start();
        customThread.start();

        for (int i = 1; i <= 3; i++){
            System.out.println(" 0 ");

            try {
                TimeUnit.SECONDS.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}