package com.imooc.tel;

public class Computer implements INet{
    public void vedio(){
        System.out.println("电脑可以看视频");
    }

    public void music(){
        System.out.println("电脑可以听音乐");
    }

//    public void network(){
//        System.out.println("电脑可以上网");
//    }

    public void game(){
        System.out.println("电脑可以打游戏");
    }

    @Override
    public void network() {
        System.out.println("电脑可以上网");
    }

    @Override
    public void connect() {

    }
}
