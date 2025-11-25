package com.avn.tns.multithread;
//demo for thread class implementation
//life cycle-->new,runnable(run),running(start),blocked
public class thread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
        }
        System.out.println("this is from thread class");
    }
    public static void main(String[] args) {
        //ob is represting thread 1
        thread ob=new thread();
        ob.start();

        //ob is represting thread 2
        thread obj=new thread();
        obj.start();
    }
}
