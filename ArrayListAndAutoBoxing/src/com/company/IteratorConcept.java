package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorConcept {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        insertOrdered(names, "Hemant");
        insertOrdered(names, "Hi");
        insertOrdered(names, "Sssfssd");
        insertOrdered(names, "Hem");

        Iterator<String> PrintNames = names.iterator();
        while (PrintNames.hasNext()) {
            System.out.println(PrintNames.next());
        }
    }


    // "a", "b", "d"
    // "c"
    private static Boolean insertOrdered(ArrayList<String> Sort, String Name) {
        ListIterator<String> i = Sort.listIterator();

        while (i.hasNext()) {
            int comparison = i.next().compareTo(Name);
            if (comparison == 0) {
                return false;
            }
            if (comparison > 0) {
                i.previous();
                i.add(Name);
                return true;
                }
            }
            i.add(Name);
            return true;
    }
}

