package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int integer = 4;
        double doubl = 4d;
        float floa = 4f;
        String str = "string";
        char ch = 'c';
        boolean bool = true;
        int intArray[] = { 1, 23, 4 };

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(45);
        intList.add(31);
        intList.add(4);

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "First item");
        map.put(45, "45 key item");

        System.out.println("Integer " + integer);
        System.out.println("Double " + doubl);
        System.out.println("Float " + floa);
        System.out.println("String " + str);
        System.out.println("Char " + ch);
        System.out.println("Boolean " + bool);
        System.out.println("Array " + intArray);
        System.out.println("List " + intList);
        System.out.println("Map " + map);
    }
}
