package com.ex06.test02;

class Bank {
    protected int savedMoney;  //存款金额
    protected int year;  //存款时长
    protected double interest;  //利息

    double computerInterest (){
        interest=year*0.35*savedMoney;
        return interest;
    }
}
