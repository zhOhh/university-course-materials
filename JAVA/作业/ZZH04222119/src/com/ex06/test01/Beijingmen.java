package com.ex06.test01;


class Beijingmen extends Chinese {
    public Beijingmen(double height, double weight) {
        super(height, weight);
    }
    public void beijingOpera() {
        System.out.println("京剧~地道~");
    }
    public void speakHello() {
        super.speakHello();
        System.out.println("子类Beijing Hello~");
    }

    @Override
    public void averageHeight() {
        super.averageHeight();
        System.out.println("子类Beijin averageHeight()");
    }

    @Override
    public void averageWeight() {
        super.averageWeight();
        System.out.println("子类Beijin averageWeight()");
    }

}
