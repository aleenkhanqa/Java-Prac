package com.bangladesh.dev.qa;

public class IfElse2String {

    public static void main(String[] args) {

        String userid = "dhaka";
        String password = "dhaka123";

//        if (userid == "dhaka") {
//            System.out.println("Dhaka is capital of Bangladesh");
//            if (password == "dhaka123") {
//                System.out.println("Password is correct");
//
//            }
//
//        } else {
//            System.out.println("Dhaka isn't capital of Bangladesh & Password isn't correct");
//        }

        if ((userid == "dhaka") && (password == "dhaka123")) {
            System.out.println("Dhaka is capital of Bangladesh and Password is correct");

        } else {
            System.out.println("Dhaka isn't capital of Bangladesh and Password is incorrect");

        }

    }


}
