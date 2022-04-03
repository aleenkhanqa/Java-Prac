package com.bangladesh.dev.qa;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        System.out.println("Well come to my calculator");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a whole number");
        int enterNumber1 = input.nextInt();

        System.out.println("Please enter another number");
        int enterNumber2 = input.nextInt();

        int addition = enterNumber1 + enterNumber2;
        System.out.println("Total Calculation was = " + addition);


    }

}
