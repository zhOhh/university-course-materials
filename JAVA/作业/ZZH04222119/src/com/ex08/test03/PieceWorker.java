/*
按其生产的产品数发放工资
 */
package com.ex08.test03;

public class PieceWorker extends Employee {
    private double productNum;  //生产产品数
    private double unitPrice;  //生产单价

    public PieceWorker(String name, double productNum, double unitPrice) {
        super(name);
        this.productNum = productNum;
        this.unitPrice = unitPrice;
    }

    @Override
    double earnings() {
        return productNum * unitPrice;
    }

    @Override
    public void show() {

        System.out.println("PrieceWoker" + this.getName() + "的工资：" + earnings());
    }
}
