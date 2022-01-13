package com.company.beans;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("inside of thread");
        for(int c=0; c<10; c++){

        }
    }
}
