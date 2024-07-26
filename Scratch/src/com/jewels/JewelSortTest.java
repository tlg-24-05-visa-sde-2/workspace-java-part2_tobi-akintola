package com.jewels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class JewelSortTest {
    public static void main(String[] args) {
        List<String> jewels = new ArrayList<String>();
        jewels.add("opal");
        jewels.add("onyx");
        jewels.add("diamond");
        jewels.add("sapphire");
        jewels.add("emerald");
        jewels.add("malachite");

        jewels.sort(null);//sort by natural order (alphabetical)
        dump(jewels);
        System.out.println();

        jewels.sort(new Comparator<String>() {
            public int compare(String jewel1, String jewel2) {
                return Integer.compare(jewel1.length(), jewel2.length());
            }
        });
        dump(jewels);
        System.out.println();
    }

    private static void dump(List<String> jewelList){
        for(String jewel : jewelList){
            System.out.println(jewel);
        }
    }
}