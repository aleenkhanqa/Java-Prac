package com.bangladesh.dev.qa1;

public class ConstructorMain {

    public static void main(String[] args) {

//       ConstructorDemo constructorDemo = new ConstructorDemo("Moinul Islam");
//        System.out.println(constructorDemo.name);

        ConstructorDemo constructorDemo = new ConstructorDemo("Moinul", "Islam", 50, "07/15/1968", "5.8");
        System.out.println(constructorDemo.firstName);
        System.out.println(constructorDemo.lastName);
        System.out.println(constructorDemo.age);
        System.out.println(constructorDemo.dateOfBrith);
        System.out.println(constructorDemo.height);




    }

}
