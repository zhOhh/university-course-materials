package com.ex09;

import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {

        System.out.println("请输入三角形的3条边：");

        Scanner s = new Scanner(System.in);

        try {

            double x = s.nextDouble();

            double y = s.nextDouble();

            double z = s.nextDouble();

            if(x+y<=z||x+z<=y||z+y<=x) {
                //异常，无法构成三角型；
                throw new NotTriangleException("您输入的三条边无法构成三角形!");
            }

            Triangle Tri = new Triangle(x,y,z);

            Triangle.getArea();

            Triangle.showInfo();

        }catch(NotTriangleException e) {

            System.out.println(e.getMessage());

        }finally {

            s.close();
        }
    }
}
