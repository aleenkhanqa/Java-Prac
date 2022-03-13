package com.bangladesh.dev.qa;

public class WhileLoop2 {
    public static void main(String[] args) {

        //  counting letter.

        String a="aleenkhan";
        int b=a.length();
        System.out.println(b);

        while (b>0) {
            b--;
            a.charAt(b);
           // System.out.println(a);
            System.out.print(a.charAt(b));
        }


    }
}
