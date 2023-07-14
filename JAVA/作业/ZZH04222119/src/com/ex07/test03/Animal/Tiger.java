package com.ex07.test03.Animal;

public class Tiger extends Animal {
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("我说是老虎 我吃肉");
    }
}
