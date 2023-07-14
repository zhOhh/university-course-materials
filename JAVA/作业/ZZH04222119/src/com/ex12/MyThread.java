package com.ex12;


public class MyThread extends Thread {
    private String name;
    private int count;

    public MyThread(String name) {
        this.name = name;
        this.count = 0;
    }

    @Override
    public void run() {
        while (count < 5) {
            count++;
            System.out.println("你好，我的名字是" + name + "，第" + count + "次来这儿");
        }
    }
}



