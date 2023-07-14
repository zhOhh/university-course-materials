/*
根据工作时间长短发放工资
 */
package com.ex08.test03;

public class HourlyWorker extends Employee {
    private double workNum;  //工作时间(小时)
    private double hourSal;  //小时工资

    public HourlyWorker(String name, double workNum, double hourSal) {
        super(name);
        this.workNum = workNum;
        this.hourSal = hourSal;
    }

    public double getWorkNum() {
        return workNum;
    }

    public void setWorkNum(double workNum) {
        this.workNum = workNum;
    }

    public double getHourSal() {
        return hourSal;
    }

    public void setHourSal(double hourSal) {
        this.hourSal = hourSal;
    }

    @Override
    double earnings() {
        return workNum * hourSal;
    }

    @Override
    public void show() {
        System.out.println("HourlyWorker" + this.getName() + "的工资：" + earnings());
    }
}
