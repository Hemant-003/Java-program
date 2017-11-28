package com.company;

public class RemoveRepeatedChar {

    public static void main(String[] args) {
        String input = "hheemmaanntt";
        String replace = input.replaceAll("(.)\\1{1,}", "$1");
        System.out.println(replace);
    }
}
