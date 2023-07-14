package com.ex09;

import java.util.Scanner;
public class IntegerExcep {
    public void m1(String str) throws IllegalNameException{
        double a = Double.parseDouble(str);
        if(a<0||a>100) {
            //异常
            //创建异常对象
            throw new IllegalNameException("数据超出有效范围!");
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入一个【0,100】之间数 :");
        Scanner s = new Scanner(System.in);
        String str = null;
        try {
            //double a = (double)(s.next());
            str = s.next();
            //double a = (double) str;
            // 将String类型转换成double类型
            //Double.parseDouble(str);

            IntegerExcep IE = new IntegerExcep();
            IE.m1(str);
            //若程序出现异常，便不会进行到这步，若无异常，即可输出
            System.out.println("转换结果为："+Double.parseDouble(str));
        }catch(IllegalNameException e){
            System.out.println(e.getMessage());

        }finally {
            s.close();
        }
        //程序若能运行到此处，输入肯定是合法的

    }

}