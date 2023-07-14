package com.ex04;

public class test02 {
    public static void main(String[] args) {
        System.out.println("修改前");
        int[] a = {1,2,3};
        for (int i = 0; i < a.length; i++) {
            System.out.println("a的第" + i + "个元素为：" + a[i]);
        }
        System.out.println("-------------");
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b的第" + i + "个元素为：" + b[i]);
        }
        System.out.println("-------------");
        b[2] = 9;
        System.out.println("修改后");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b的第" + i + "个元素为：" + b[i]);
        }
        System.out.println("-------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a的第" + i + "个元素为：" + a[i]);
        }
    }
}
