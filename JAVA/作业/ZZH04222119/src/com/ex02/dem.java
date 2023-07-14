package com.ex02;

public class dem {
    public static void main(String[] args) {

                Dog dog1 = new Dog("Tjo", "白色", 4);
                dog1.show();
                Dog dog2 = new Dog("sss", "黑色", 8);
                dog2.show();
    }
}
class Dog{
    String name;
    String color;
    int age;

    Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show(){
        System.out.println("  姓名：" + name + "  毛色： " + color + "  年龄：" + age);
    }

}
