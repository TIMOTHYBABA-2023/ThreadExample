package org.example;

public class CustomThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(" 6666 ");

            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
