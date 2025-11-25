package com.avn.tns.multithread;

public class Sync extends Thread{
    public static void mul(int no){
        for(int i=0;i<=4;i++){
            int res=no*i;
            System.out.println(res);
        }
    }

}