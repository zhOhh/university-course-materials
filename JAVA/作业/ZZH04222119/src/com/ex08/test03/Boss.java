/*
每星期发给他固定工资，而不计工作时间
 */
package com.ex08.test03;

public class Boss extends Employee {
    private double fixedSal; //固定工资

    public Boss(String name, double fixedSal) {
        super(name);
        this.fixedSal = fixedSal;
    }

    @Override
    double earnings() {
        return fixedSal;
    }

    @Override
    public void show() {
        System.out.println("Boss" + this.getName() + "的工资：" + earnings());
    }
}
