package com.ex05;

public class TestAddressBook {
    public static void main(String[] args) {
        AddressBook zhangsan_addr = new AddressBook();
        zhangsan_addr.setName("张三");
        zhangsan_addr.setAddress("中国北京");
        zhangsan_addr.setTel("13311112222");
        zhangsan_addr.getAllInfo();
    }
}

class AddressBook {
    String name;
    String address;
    String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public void getAllInfo() {
        System.out.println("姓名：" + getName());
        System.out.println("地址：" + getAddress());
        System.out.println("电话：" + getTel());
    }
}