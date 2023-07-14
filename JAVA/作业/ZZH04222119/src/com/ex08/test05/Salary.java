package com.ex08.test05;

abstract class Employee {
    // 抽象方法，用于计算工资
    public abstract double earnings();
}

final class Boss extends Employee {
    private double weeklySalary; // 固定每周工资

    public Boss(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    // 实现计算工资方法
    @Override
    public double earnings() {
        return weeklySalary;
    }
}

final class CommissionWorker extends Employee {
    private double baseSalary; // 基本工资
    private double sales; // 销售额
    private double commissionRate; // 提成比例

    public CommissionWorker(double baseSalary, double sales, double commissionRate) {
        this.baseSalary = baseSalary;
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    // 实现计算工资方法
    @Override
    public double earnings() {
        return baseSalary + sales * commissionRate;
    }
}

final class PieceWorker extends Employee {
    private int pieces; // 生产的产品数
    private double wagePerPiece; // 每件产品的工资

    public PieceWorker(int pieces, double wagePerPiece) {
        this.pieces = pieces;
        this.wagePerPiece = wagePerPiece;
    }

    // 实现计算工资方法
    @Override
    public double earnings() {
        return pieces * wagePerPiece;
    }
}

final class HourlyWorker extends Employee {
    private int hours; // 工作时间
    private double wagePerHour; // 每小时工资

    public HourlyWorker(int hours, double wagePerHour) {
        this.hours = hours;
        this.wagePerHour = wagePerHour;
    }

    // 实现计算工资方法
    @Override
    public double earnings() {
        return hours * wagePerHour;
    }
}

public class Salary {
    public static void main(String[] args) {
        // 创建Employee对象数组
        Employee[] employees = new Employee[4];

        // 初始化数组元素
        employees[0] = new Boss(1000);
        employees[1] = new CommissionWorker(500, 10000, 0.1);
        employees[2] = new PieceWorker(200, 3);
        employees[3] = new HourlyWorker(40, 20);

        // 遍历数组，计算工资单
        for (Employee employee : employees) {
            System.out.printf("该雇员的工资为：$%,.2f%n", employee.earnings());
        }
    }
}
