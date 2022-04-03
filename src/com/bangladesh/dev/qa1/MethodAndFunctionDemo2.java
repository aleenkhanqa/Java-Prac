package com.bangladesh.dev.qa1;

public class MethodAndFunctionDemo2 {

    private int a;
    private int b;

    public void setVelue() {
        a = 4;
        b = 5;

    }
//    public MethodAndFunctionDemo2(int a, int b){
//                this.a = a;
//                b = b;
//
//       a = c;
//       b = d;
//
//    }

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
    public int getVelue() {

        System.out.println("This is return velue " + (a + b));
        return a + b;

    }

    public static void main(String[] args) {
        MethodAndFunctionDemo2 methodDemo = new MethodAndFunctionDemo2();
        methodDemo.setVelue();
        methodDemo.getVelue();
        //System.out.println(methodDemo.getVelue());


    }

}

