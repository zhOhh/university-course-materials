package com.ex11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Student implements Serializable {


    private static final long serialVersionUID = 1L; //序列化ID


    private String name;   //姓名

    private int age;   //年龄

    private int javaScore; //java成绩

    private int cScore;//c语言成绩


    public Student() {

    }


    public Student(String name, int age, int javaScore, int cScore) {

        this.name = name;

        this.age = age;

        this.javaScore = javaScore;

        this.cScore = cScore;

    }

    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }


    public void setAge(int age) {

        this.age = age;

    }


    public int getJavaScore() {

        return javaScore;

    }


    public void setJavaScore(int javaScore) {

        this.javaScore = javaScore;

    }


    public int getcScore() {

        return cScore;

    }


    public void setcScore(int cScore) {

        this.cScore = cScore;

    }

    @Override

    public String toString() {


        return new String("学生" + name + "的年龄为" + age + "，Java成绩为" + javaScore + "，C语言成绩为" + cScore + "。");

    }

}

