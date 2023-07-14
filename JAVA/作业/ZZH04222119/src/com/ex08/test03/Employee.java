package com.ex08.test03;

abstract class Employee {
    private String Name;

    public Employee(){}
    public Employee(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void show(){};
    abstract double earnings();
}
