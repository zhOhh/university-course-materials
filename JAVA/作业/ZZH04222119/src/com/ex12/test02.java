package com.ex12;

public class test02 {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("张三");
        MyRunnable runnable2 = new MyRunnable("李四");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }

}
