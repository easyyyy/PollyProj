package com.imooc.test;

import com.imooc.tel.*;

public class PhoneTest {
    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.network();
        INet.stop();
        INet i = new INet() {
            @Override
            public void network() {
                System.out.println("hahha");
            }
        };
        i.network();

        FourthPhone j = new FourthPhone();
        j.connect();

    }
}
