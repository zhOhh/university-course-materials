package com.ex07.test01;

public class TestArg {
    public static void main(String[] args) {
        int i;
        if(args.length > 0) {
            for (i = 0; i <= args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
            System.out.println(i);
        } else {
            System.out.println("缺少参数");
        }
    }
}
