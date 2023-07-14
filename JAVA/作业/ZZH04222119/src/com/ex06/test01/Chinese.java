package com.ex06.test01;

class Chinese extends People {
    public Chinese(double height, double weight) {
        super(height, weight);
    }

    public void chinaGongfu() {
        System.out.println("中国功夫！");
    }

    @Override
    public void speakHello() {
        super.speakHello();
        System.out.println("子类Chinese Hello~");
    }

    @Override
    public void averageHeight() {
        super.averageHeight();
        System.out.println("子类Chinese averageHeight()");
    }

    @Override
    public void averageWeight() {
        super.averageWeight();
        System.out.println("子类Chinese averageWeight()");
    }


}
