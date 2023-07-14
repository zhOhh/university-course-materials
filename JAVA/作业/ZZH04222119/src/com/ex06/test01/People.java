package com.ex06.test01;

class People {
    protected double height;
    protected double weight;

    public People(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void speakHello() {
        System.out.println("父类People Hello~");
    }

    public void averageHeight() {
        System.out.println("父类People averageHeight()");
    }
    public void averageWeight() {
        System.out.println("父类People averageWeight()");
    }

}
