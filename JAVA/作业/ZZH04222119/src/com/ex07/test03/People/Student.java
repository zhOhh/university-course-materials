package com.ex07.test03.People;

public class Student extends People {
    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("我是学生，我爱吃饭");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("我是学生，我爱说话");
    }
    public void toShow() {
        System.out.println("这是一名学生：");
        super.toShowBase();
        eat();
        speak();
    }
}
