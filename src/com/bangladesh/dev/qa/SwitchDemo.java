package com.bangladesh.dev.qa;

//import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        String name = in.next();

        String name = "Refat Bhai";

        switch (name) {
            case "Refat Bhai":
                System.out.println("Refat Bhai lives is Jamaica");
//                break;
            case "Aleen Khan":
                System.out.println("He is living in Queens");
//                break;
            case "mehedi aziz":
                System.out.println("He is living in Delaware");
//                break;
            default:
                System.out.println("Please enter a valid name");


        }


    }


}
