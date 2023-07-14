package com.ex05;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个正整数：");
        int num = scanner.nextInt();
        boolean bool = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                bool = false;
                break;
            }
        }
        if (bool){
            System.out.println(num + "是素数");
        }else {
            System.out.println(num + "不是素数");
        }
    }
}
