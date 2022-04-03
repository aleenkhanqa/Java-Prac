package com.bangladesh.dev.qa1;

public class MethodAndFunctionDemo {

    static int a = 1;
    static int b = 2;
    public MethodAndFunctionDemo(){

    }

    // 2 kind of Method =====
    // 1. Void Method
    // 2. Return Method

    // Create Voit Method ===========
    public void addition() {
        System.out.println("My sum was 5");
    }

    // Create Return Method

    //    int a = 1;
    //    int b = 2;
    public int additions() {
        return a + b;

    }

    public static void main(String[] args) {
        MethodAndFunctionDemo methodDemo = new MethodAndFunctionDemo();
        methodDemo.addition();
        System.out.println(methodDemo.additions());


    }

}
