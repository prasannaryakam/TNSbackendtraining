package com.avn.tns.multithread;
//runnable interface-->run
public class demorun extends sample implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread());
    }
}
