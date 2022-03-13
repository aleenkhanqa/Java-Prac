package com.bangladesh.dev.qa;

public class IfElseDemo {
    public static void main(String[] args) {

        String name = "koddus";
        String address = "CT";

        if ((name == "koddus") && (address == "CT")) {

            System.out.println("This is correct");

        } else {
            System.out.println("This is wrong");
        }
        String name1 = "Koddus";
        String address1 = "Jamaica";

        if (name1 == "Koddus") {

            System.out.println("show me his address1" + " " + "name1");

        } else {
            System.out.println("String is wrong");
        }
        String userId = "javaid";
        int password = 12345;

        if ((userId == "javaid") || (password == 12345)) {

            System.out.println("The userId and password is correct");

        } else {
            System.out.println("The userId and password is wrong");
        }

        if (password == 12345) {

            System.out.println("The password is correct");

        } else {
            System.out.println("The password is wrong");
        }


    }


}
