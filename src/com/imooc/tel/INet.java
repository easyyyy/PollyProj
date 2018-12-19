package com.imooc.tel;

public interface INet {


    void network();

    int TEMP=20;
    default void connect(){
        System.out.println("Inet connect");
    }

    static void stop(){
        System.out.println("我是接口中的静态方法");
    }
}
