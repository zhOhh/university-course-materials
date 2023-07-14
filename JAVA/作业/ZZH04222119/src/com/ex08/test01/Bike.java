package com.ex08.test01;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("自行车启动");
    }

    @Override
    public void stop() {
        System.out.println("自行车停止");
    }
}
