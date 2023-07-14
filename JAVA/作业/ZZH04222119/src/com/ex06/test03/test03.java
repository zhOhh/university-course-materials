package com.ex06.test03;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入基本星期工资：");
        double basicWeekEarnings = scanner.nextDouble();
        System.out.println("输入基本月工资：");
        double basicMonthEarnings = scanner.nextDouble();
        System.out.println("输入基本年工资：");
        double basicYearEarnings = scanner.nextDouble();

        Employee[] employee = new Employee[9];

        for (int i = 0; i < 9; i++) {
            if(i < 3) {
                employee[i] = new WeekWorker();
                employee[i].basicWage = basicWeekEarnings;
            }else if (i < 6) {
                employee[i] = new MonthWorker();
                employee[i].basicWage = basicMonthEarnings;
            }else {
                employee[i] = new YearWorker();
                employee[i].basicWage = basicYearEarnings;
            }
        }

        Company company = new Company(employee);
        System.out.println("公司薪水总额：" + company.salaryPlay());

    }
}
