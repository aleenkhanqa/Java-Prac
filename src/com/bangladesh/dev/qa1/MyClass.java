package com.bangladesh.dev.qa1;

public class MyClass {
    int x; // Create a class attribute x

    public MyClass() {
        x = 6; // Set the initial value for the class attribute x to 6

    }

    public static void main(String[] args) {
        // Create an myObj object of the class MyClass
        // (This will call the constructor

        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }

}
