package com.practise.core.logic;

import java.util.*;

public class MapFunctions {

    /*Points to remember
    Java HashMap class contains values based on the key.
    Java HashMap class contains only unique keys.
    Java HashMap class may have one null key and multiple null values.
    Java HashMap class is non synchronized.
    Java HashMap class maintains no order.
    The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
    It uses an array and LinkedList data structure internally for storing Key and Value

    LinkedHashmap
    Java LinkedHashMap maintains insertion order.

    TreeMap
    Java TreeMap cannot have a null key but can have multiple null values.
    Java TreeMap maintains ascending order.

    Look for Navigable Map and Sorted Map*/

    static void putFucn() {
        Map<String, Integer> example = new HashMap<>();
        example.put("", 1);
        example.put("abc", 2);
        example.putIfAbsent("har", 3);
        example.put("", 4);
        //example.remove("");

        for (Map.Entry entry : example.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", Value is : " + entry.getValue());
        }

        example.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        example.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);


    }

    static void putInHashTable() {
        Map example = new Hashtable();
        example.put(1, 2);
        example.put(2, 2);
        try {
            example.put(null, 4);
        } catch (Exception e) {
            e.printStackTrace();
            //System.exit(1);
            return;
        } finally {
            System.out.println("in Finally");
        }
        System.out.println(example);
    }

    static void LinkedHashMapFunc() {
        Map<Integer, Integer> example = new LinkedHashMap<>();
        example.put(1, 2);
        example.put(3, 4);
        example.put(2, 5);

        System.out.println("Keys : " + example.keySet());
        System.out.println("values : " + example.values());
        System.out.println("EntrySet : " + example.entrySet());
    }

    static void TreeMapFunc() {
        //SortedMap<Integer,Integer> example = TreeMap<>();
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(2, 3);
        map.put(1, 2);
        map.put(6, 7);

        System.out.println(map.entrySet());
    }

    public static void main(String[] args) {
        putFucn();
        putInHashTable();
        LinkedHashMapFunc();
        TreeMapFunc();
    }
}
