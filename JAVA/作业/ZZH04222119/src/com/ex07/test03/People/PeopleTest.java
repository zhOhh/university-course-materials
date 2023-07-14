package com.ex07.test03.People;

public class PeopleTest {
    public static void main(String[] args) {
        Employee employee = new Employee("张三",28, "男", "1111111");
        Student student = new Student("李四", 12, "男");
        employee.toShow();
        student.toShow();
    }
}
