package com.bangladesh.dev.qa;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("yollow round fruit");
            case "Grapes":
                System.out.println("Smalle fruit");
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
