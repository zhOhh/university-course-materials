package com.ex07.test03.People;

public class People {
    protected String name;
    protected int age;
    protected String sex;

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void eat() {}
    public void speak(){}
    public void toShowBase() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("性别：" + this.sex);
    }
}
