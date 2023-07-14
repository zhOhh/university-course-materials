package com.ex03;

import java.util.Random;
import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入你的猜测：");
        while (true){
            int num2 = scanner.nextInt();
            System.out.println(num2);
            if(num1 > num2){
                System.out.print("猜小了，再输入你的猜测：");
            }else if(num1 < num2){
                System.out.print("猜大了，再输入你的猜测：");
            }else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
