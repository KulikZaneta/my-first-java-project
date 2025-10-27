package com.codefirstgirls.week2.session2;

public class StringReversal {
    public static void main(String[] args) {
        String text = "CFG";
        String reversed = reverseString(text);
        System.out.println(reversed);

    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

}

