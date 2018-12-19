package com.imooc.tel;

public class FourthPhone extends ThirdPhone implements Iphoto,INet {
    @Override
    public void photo(){
        System.out.println("手机可以拍照");
    }

    @Override
    public void network(){
        System.out.println("手机可以上网");
    }

//    @Override
//    public void connect() {
//        System.out.println("fourthphone connect");
//    }

    public void game(){
        System.out.println("手机可以打游戏");
    }
}
