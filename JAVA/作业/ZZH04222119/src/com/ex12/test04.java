package com.ex12;

public class test04 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Loader loader = new Loader(warehouse);
        Driver driver = new Driver(loader);

        driver.start();
    }
}

class Driver extends Thread {
    private Loader loader;

    public Driver(Loader loader) {
        this.loader = loader;
    }

    @Override
    public void run() {
        try {
            System.out.println("运货司机正在等待装运工完成工作");
            loader.join();
            System.out.println("运货司机开始运货");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Loader extends Thread {
    private Warehouse warehouse;

    public Loader(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        try {
            System.out.println("装运工正在等待仓库管理员打开仓库");
            warehouse.open();
            System.out.println("装运工开始装运货物");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Warehouse {
    private boolean isOpen = false;

    public synchronized void open() throws InterruptedException {
        while (!isOpen) {
            wait();
        }
    }

    public synchronized void unlock() {
        isOpen = true;
        notifyAll();
    }
}
