package com.bangladesh.dev.qa1;

public class Constructor {

    String name;
    int age;
    static String school = "Malikanda Meghula High School";

    public Constructor() {
//        name = n;
//        age = a;

    }

    public void getName() {
        System.out.println(school);

        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        constructor.age = 52;
        constructor.name = "aleen";
        constructor.getName();

    }
}
