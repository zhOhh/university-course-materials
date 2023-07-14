package com.ex07.test02;

public class Employee {
    protected int sid;
    protected String sname;
    protected String sex;
    protected int age;

    public Employee(int sid, String sname, String sex, int age) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "编号：" + this.sid + " 姓名：" + this.sname + " 性别：" + this.sex + " 年龄：" + this.age;
    }
}
