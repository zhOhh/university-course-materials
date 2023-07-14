package com.ex02;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入层数：");
        int num = scanner.nextInt();
//        先判断层数是否为奇数
        if (num % 2 != 0){
            int botNum = num / 2;  //下三角
            int topNum = num - botNum;  //上三角
            for (int i = 0; i < topNum; i++) {
                for (int j = 0; j < topNum-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = botNum-1; i >= 0; i--) {
                for (int j = 0; j <= botNum-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("输入有误，层数必须为奇数！");
        }

    }
}

