package com.imooc.people;

public class People {

    int age;

    public Heart getHeart(){
        return new Heart();
    }

    public void eat(){
        System.out.println("peopleeat");
    }

    class Heart {
        public void eat(){
            System.out.println("hearteat");
        }
        public String beat(){
            eat();
            return age+"心跳";
        }
    }
}
