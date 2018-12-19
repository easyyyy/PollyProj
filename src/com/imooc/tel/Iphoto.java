package com.imooc.tel;

public interface Iphoto {
    public void photo();

    default void connect(){
        System.out.println("Iphotp connect");
    }
}
