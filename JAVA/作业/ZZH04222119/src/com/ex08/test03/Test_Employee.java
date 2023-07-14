package com.ex08.test03;

public class Test_Employee {
    public static void main(String[] args) {
        Boss boss = new Boss("张三", 600);
        boss.show();

        CommissionWorker commissionworker = new CommissionWorker("李四", 500, 200);
        commissionworker.show();

        PieceWorker pieceworker = new PieceWorker("王五", 220, 5);
        pieceworker.show();

        HourlyWorker hourlyworker = new HourlyWorker("赵六", 2.5, 50);
        hourlyworker.show();
    }
}
