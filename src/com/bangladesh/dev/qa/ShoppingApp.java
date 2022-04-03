package com.bangladesh.dev.qa;

import java.util.HexFormat;

public class ShoppingApp {

    public static void main(String[] args) {

        Electronics electronics = new Electronics();  //object creation/instance
        System.out.println(electronics.laptopNamet);
        System.out.println(electronics.laptopPrice);
        System.out.println(electronics.releaseDate);
        System.out.println(electronics.specifications);

        System.out.println("=====================================");

        HelloInfo helloInfo = new HelloInfo();  //object creation/instance
        System.out.println(helloInfo.goodMorning);
        System.out.println(helloInfo.goodafternoon);
        System.out.println(helloInfo.goodEvening);
        System.out.println(helloInfo.goodNight);


    }


}
