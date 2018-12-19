package com.imooc.people;

public class PeopleTest {
    public static void main(String[] args) {
        People lili = new People();
        lili.age = 18;

        People.Heart myHeart = new People().new Heart();
        System.out.println(myHeart.beat());
        System.out.println("=======================");

        myHeart = lili.new Heart();
        System.out.println(myHeart.beat());
        System.out.println("=======================");

        myHeart = lili.getHeart();
        System.out.println(myHeart.beat());

    }

}
