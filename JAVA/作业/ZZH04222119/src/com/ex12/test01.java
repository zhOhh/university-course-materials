package com.ex12;

public class test01 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("张三");
        MyThread thread2 = new MyThread("李四");

        thread1.start();
        thread2.start();
    }
}



