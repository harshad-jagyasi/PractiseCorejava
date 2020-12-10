package com.practise.core.java8;

import java.util.*;

public class SortNameArrayList {
    static List<String> names1 = new ArrayList<String>();
    static List<String> names2 = new LinkedList<String>();
    Set<String> abc = new LinkedHashSet<>();

    public void sortByjava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1 , String s2){
                return s1.compareTo(s2);
            }
        });
    }

    public void sortByjava8(List<String> names){
        Collections.sort(names, (s1,s2) -> s1.compareTo(s2));
    }

    public static void main(String[] args){
        names1.add("harshad");
        names1.add("Mahesh");
        names1.add("Suresh");
        names1.add("jagyasi");
        names1.add("Deepak");
        names1.add("1");
        names1.add("2");

        names2.addAll(names1);

        SortNameArrayList sortNameArrayList = new SortNameArrayList();
        //sortNameArrayList.sortByjava7(names1);
        //ortNameArrayList.sortByjava8(names2);

        System.out.println(names1);
        System.out.println(names2);

    }
}
