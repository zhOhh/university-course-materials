package com.ex06.test02;

class BankOfDalian extends Bank {
    protected double year;
    double computerInterest() {
        super.year = (int)year;   //   除去小数部分 整数即为年份
        super.computerInterest();  //   按Bank的方法计算出整年的利息
        int day = (int)((year - super.year) * 1000);  //  算出去除整年后还剩的天数 day
        interest += day * 0.35 / 365 *savedMoney;  //  总利息 = 整年利息 + 零下天利息  （天利率 = 年利率 / 365）
        System.out.println(savedMoney + "元在大连银行" + super.year + "年零" + day + "天的利息：" + interest + "元" );
        return interest;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }
}
