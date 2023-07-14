package com.ex02;

import java.util.Scanner;

public class GradeIdentify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入JAVA成绩：");
        int score = scanner.nextInt();
        if(score >= 0 && score <= 100){
            if(score >= 90){
                System.out.println("优");
            } else if (score >= 80) {
                System.out.println("良");
            } else if (score >= 70) {
                System.out.println("中");
            } else if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }else {
            System.out.println("输入有误 成绩为0~100");
        }

    }
}
