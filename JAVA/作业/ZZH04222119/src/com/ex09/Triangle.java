package com.ex09;

public class Triangle {
    //成员x,y,z作为三角形的三边长；
    static double x,y,z;
    //double y;
    //double z;
    //构造方法通过参数分别对x,y,z赋值；
    public Triangle(double x,double y,double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //getArea求面积
    public static double getArea() throws NotTriangleException{
		/*
		Triangle T = new Triangle(x,y,z);
		if(x+y<z||x+z<y||z+y<x) {
			//异常，无法构成三角型；
			throw new NotTriangleException("您输入的三条边无法构成三角形!");
		}
		*/
        double p,Area;
        p=(x+y+z)/2;
        Area = Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return Area;
    }
    //showInfo显示三角形信息
    public static void showInfo() throws NotTriangleException{
        //Triangle.getArea();
        double Area = getArea();
        System.out.println("三角形的三条边分别为："+x+" "+y+" "+z+'\n'+"面积为："+Area);

    }
}
