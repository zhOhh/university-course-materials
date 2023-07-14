package com.ex12;

public class test03 {
    public static void main(String[] args) throws InterruptedException {
        Student student1 = new Student("student1", 10);
        Student student2 = new Student("student2", 60);
        Teacher teacher = new Teacher();

        student1.start();
        student2.start();

        // 等待student1和student2线程启动
        Thread.sleep(1000);

        teacher.start();

        // 等待teacher线程完成
        teacher.join();
    }
}

class Student extends Thread {
    private String name;
    private int sleepTime;

    public Student(String name, int sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + "准备睡觉" + sleepTime + "分钟");
            Thread.sleep(sleepTime * 1000);
            System.out.println(name + "已经睡了" + sleepTime + "分钟，可以开始上课了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Teacher extends Thread {

    @Override
    public void run() {
        System.out.println("上课！");
        Thread student1Thread = findThread("student1");
        if (student1Thread != null) {
            student1Thread.interrupt();
        }
        Thread student2Thread = findThread("student2");
        if (student2Thread != null) {
            student2Thread.interrupt();
        }
    }

    private Thread findThread(String name) {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        while (group.getParent() != null) {
            group = group.getParent();
        }
        Thread[] threads = new Thread[group.activeCount()];
        group.enumerate(threads);
        for (Thread thread : threads) {
            if (thread != null && thread.getName().equals(name)) {
                return thread;
            }
        }
        return null;
    }
}
