package com.imooc.tel;

public class SmartWatch implements INet,Iphoto {
    public void network(){
        System.out.println("智能手表可以上网");

    }

    @Override
    public void connect(){
        System.out.println("smartwatch");
    }



    public void message(){
        System.out.println("智能手表可以发短信");
    }
    public void call(){
        System.out.println("智能手表可以打电话");
    }

    @Override
    public void photo() {

    }
}
