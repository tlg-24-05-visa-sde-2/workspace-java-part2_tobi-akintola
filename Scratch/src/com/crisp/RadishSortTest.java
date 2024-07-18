package com.crisp;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class RadishSortTest {
    public static void main(String[] args) {
        //<Radish> is a constructor so youre saying a list of radish constructors
        List<Radish> radishes = new ArrayList<Radish>();

        radishes.add(new Radish("red", 2.75, 0.0, 7));
        radishes.add(new Radish("pink", 1.1, 2.1, 2));
        radishes.add(new Radish("red", 0.7, 3.3, 0));
        radishes.add(new Radish("black", 1.9, 0.0, 0));

        System.out.println("Original list");
        dump(radishes);
        System.out.println();

        System.out.println("Sort by natural order (size)");
        radishes.sort(null); //null means natural order
        dump(radishes);
        System.out.println();

        System.out.println("Sort ny guysOnTop, via Comparator");
        radishes.sort(new RadishGuysOnTopComparator());
        dump(radishes);
        System.out.println();

        System.out.println("Sort by color via comparator");
        radishes.sort(new RadishColorComparator());
        dump(radishes);
        System.out.println();
    }

    private static void dump(List<Radish> radishList){
        for(Radish radish : radishList){
            System.out.println(radish);
        }
    }
}