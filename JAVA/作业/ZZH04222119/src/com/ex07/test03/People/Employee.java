package com.ex07.test03.People;

public class Employee extends People {
    protected String id;

    public Employee(String name, int age, String sex, String id) {
        super(name, age, sex);
        this.id = id;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("我是员工，我爱吃饭");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("我是员工，我爱说话");
    }
    public void work() {
        System.out.println("我是员工，我的工作很简单！");
    }
    public void toShow() {
        System.out.println("这是一名员工：");
        super.toShowBase();
        System.out.println("工号：" + this.id);
        eat();
        speak();
        work();
    }
}
