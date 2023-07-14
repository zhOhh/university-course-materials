package com.ex06.test02;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConstructionBank constructionBank = new ConstructionBank();//创建建设银行对象 constructionBank
        BankOfDalian bankOfDalian = new BankOfDalian();//创建大连银行对象 bankOfDalian

        System.out.println("输入存款金额：");
        constructionBank.savedMoney = scanner.nextInt();
        bankOfDalian.savedMoney = constructionBank.savedMoney;
        System.out.println("输入存款时长：");
        constructionBank.year = scanner.nextDouble();
        bankOfDalian.year = constructionBank.year;
        System.out.println("输入建设银行的存款利率：");
        constructionBank.rate = scanner.nextDouble();

//        分别调用两个对象的computerInterest()方法
        constructionBank.computerInterest();
        bankOfDalian.computerInterest();

        double dif;//利息差值
        if(constructionBank.interest > bankOfDalian.interest) {//建设银行>大连银行
            dif = (double) constructionBank.interest - (double) bankOfDalian.interest;
            System.out.println("建设银行的利息大于大连银行：" + dif);
        } else if (constructionBank.interest < bankOfDalian.interest) {//大连银行>建设银行
            dif = (double) bankOfDalian.interest - (double)constructionBank.interest;
            System.out.println("大连银行的利息大于建设银行 差值为：" + dif);
        } else {//建设银行=大连银行
            System.out.println("两家银行利息相等");
        }

    }
}
