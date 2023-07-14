package com.ex09;

import java.util.InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

//计算两数相除并输出结果
public class DivideExcep {
    //public static void m1() {
    public static void main(String[] args) {

        try {
            System.out.println("计算两数相除并输出结果\n请输入 除数：");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("请输入被除数：");
            int b = s.nextInt();
            double c = a / b;
            //System.out.println(a+"/"+b+"="+c);
            s.close();
        } catch (ArithmeticException e) {
            System.out.println("对不起，除数不能为0！");

        }
        // 数字格式化异常
        catch (InputMismatchException e) {
            System.out.println("对不起，除法运算不能含有字母！");
            //System.out.println(e);
        }

    }


}
