package com.imooc.tel;

public class Telphone {

    private String brand;
    private int price;

    public Telphone() {
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void call(){
        System.out.println("手机可以打电话");
    }
}
