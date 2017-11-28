package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrenceCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String a = sc.nextLine();
        int l = a.length();
        for (int i = 0; i < l; i++) {
            char c = a.charAt(i);
            for (int j = 0; j < l; j++) {
                int count = 0;
                if (c == a.charAt(j)) {
                    count++;
                }
                Map<String, Integer> countMap = new HashMap<>();
                countMap.put(a, count);
                for (k)
            }

        }
    }
}