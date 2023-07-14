package com.ex02;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
