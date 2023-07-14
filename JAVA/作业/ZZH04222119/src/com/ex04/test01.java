package com.ex04;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.next();
        char[][]strs=new char[2][str.length()];
        for(int i =0;i<str.length();i++) {
            boolean flag =true;
            for(int j =0;j<str.length();j++) {
                if(str.charAt(i)==strs[0][j]) {
                    strs[1][j]++;
                    flag=false;
                }
            }
            if(flag) {
                strs[0][i]=str.charAt(i);
                strs[1][i]++;
            }
        }
        for(int k=0;k<str.length();k++) {
            if(strs[0][k]!=0) {
                System.out.println("字符："+strs[0][k]+" 出现了"+(int)strs[1][k]+"次");
            }
        }
    }



}
