package com.ex06.test01;

class American extends People {
    public American(double height, double weight) {
        super(height, weight);
    }

    public void americanBoxing() {
        System.out.println("American~Boxing~");
    }

    public void speakHello() {
        super.speakHello();
        System.out.println("子类American Hello~");
    }

    @Override
    public void averageHeight() {
        super.averageHeight();
        System.out.println("子类American averageHeight()");
    }

    @Override
    public void averageWeight() {
        super.averageWeight();
        System.out.println("子类American averageWeight()");
    }

}
