package com.practise.core.logic;

import java.util.*;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "java tutorial";
        char[] c = name.toCharArray();

        List<Character> rev = new ArrayList<>();

        for(char cc : c){
            rev.add(cc);
        }

        Collections.reverse(rev);
        ListIterator li = rev.listIterator();
        while (li.hasNext()){
            System.out.print(li.next());
        }
        revAString("geeks for geeks");
    }

    public static void revAString(String str)
    {
     char[] charStr = str.toCharArray();
     int len = charStr.length;
        System.out.println();
     for(int i=len-1 ; i>=0 ; i-- )
     {
         System.out.print(charStr[i]);
     }
    }
}
