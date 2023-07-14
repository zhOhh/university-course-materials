package com.ex05;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaRect,areaCircle = 0;  //面积
        double longRect,longCircle = 0;  //周长

        //创建矩形对象
        Rect rect = new Rect();
        System.out.println("输入矩形的长：");
        rect.setLength(scanner.nextDouble());
        System.out.println("输入矩形的宽：");
        rect.setWidth(scanner.nextDouble());
        areaRect = rect.getLength() * rect.getWidth();
        longRect = 2 * (rect.getLength() + rect.getWidth());
        System.out.println("矩形信息如下：\n" + "长：" + rect.getLength() + "宽：" + rect.getWidth()
         + "面积：" + areaRect + "周长：" + longRect);

        //创建圆对象
        Circle circle = new Circle();
        System.out.println("输入圆形的半径：");
        circle.setRadius(scanner.nextDouble());
        areaCircle = 3.14 * circle.getRadius() * circle.getRadius();
        longCircle = 2 * 3.14 * circle.getRadius();
        System.out.println("圆形信息如下：\n" + "半径：" + circle.getRadius()
                + "面积：" + areaCircle + "周长：" + longCircle);
    }
}
class Rect {
    double length;
    double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
class Circle {
    double Radius;

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }
}