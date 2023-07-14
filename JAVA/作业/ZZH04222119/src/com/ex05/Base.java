package com.ex05;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        //接收一个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();

        //转换为二进制
        int[] numEr = new int[8];
        int indexEr = 0;  //计数
        for (int i = num; i > 0; i /= 2,indexEr++) {
            numEr[indexEr] = i % 2;
        }
        System.out.println("二进制：");
        for (int i = 7; i >= 0; i--) {
            System.out.print(numEr[i]);
        }

        //转换为八进制
        int[] numBr = new int[8];
        int indexBr = 0;
        for (int i = num; i > 0; i /= 8,indexBr++) {
            numBr[indexBr] = i % 8;
        }
        System.out.println("\n八进制：");
        for (int i = indexBr-1; i >= 0; i--) {
            System.out.print(numBr[i]);
        }

        //转换为十六进制
        int[] nums = new int[100];
        int indexs = 0;
        for (int i = num; i > 0; i /= 16,indexs++) {
            nums[indexs] = i % 16;
        }
        System.out.println("\n十六进制：");
        for (int i = indexs - 1; i >= 0; i--) {
            if(nums[i] == 10){
                System.out.println("A");
            }else if(nums[i] == 11){
                System.out.println("B");
            }else if(nums[i] == 13){
                System.out.println("C");
            }else if(nums[i] == 14){
                System.out.println("D");
            }else if(nums[i] == 15){
                System.out.println("E");
            }else if(nums[i] == 16){
                System.out.println("F");
            }else {
                System.out.print(nums[i]);
            }
        }
    }
}
