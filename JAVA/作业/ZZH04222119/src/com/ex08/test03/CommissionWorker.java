/*
除基本工资外还根据销售额发放浮动工资
 */
package com.ex08.test03;

public class CommissionWorker extends Employee {
    private double baseSal;  //基本工资
    private double floatSal;  //浮动工资

    public CommissionWorker(String name, double baseSal, double floatSal) {
        super(name);
        this.baseSal = baseSal;
        this.floatSal = floatSal;
    }

    public double getBaseSal() {
        return baseSal;
    }

    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }

    public double getFloatSal() {
        return floatSal;
    }

    public void setFloatSal(double floatSal) {
        this.floatSal = floatSal;
    }

    @Override
    double earnings() {
        return baseSal+floatSal;
    }

    @Override
    public void show() {
        System.out.println("CommissionWorker" + this.getName()+"的工资："+ earnings());
    }
}
