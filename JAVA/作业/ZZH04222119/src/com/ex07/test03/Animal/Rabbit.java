package com.ex07.test03.Animal;

public class Rabbit extends Animal {
    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("我说是兔子 我吃草");
    }
}
