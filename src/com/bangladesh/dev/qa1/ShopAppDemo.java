package com.bangladesh.dev.qa1;

public class ShopAppDemo {

    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        calculate.division();
        System.out.println(calculate.division());

        Calculate calculate1 = new Calculate();
        calculate1.multiplication();
        System.out.println(calculate.multiplication());

        Calculate calculate2 = new Calculate();
        calculate2.addition();
        System.out.println(calculate2.addition());

        Calculate calculate3 = new Calculate();
        calculate3.subtraction();
        System.out.println(calculate3.subtraction());


    }

}
