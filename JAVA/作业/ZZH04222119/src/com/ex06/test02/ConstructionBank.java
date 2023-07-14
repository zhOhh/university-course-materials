package com.ex06.test02;

class ConstructionBank extends Bank{
    protected double year;
    protected double rate;

    double computerInterest() {
        super.year = (int)year;
        super.computerInterest();
        int day = (int)((year -super.year) * 1000);
        interest += day * rate / 365 * savedMoney;
        System.out.println(savedMoney + "元在建设银行" + super.year + "年零" + day + "天的利息：" + interest + "元" );
        return interest;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
