package com.practise.core.logic;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

    static int[] arr = new int[]{1,5,6,2,5,7,8,3,2,5,7,9};

    static void sortAnArray()
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortSubArray()
    {
        Arrays.sort(arr,3,6);
        System.out.println(Arrays.toString(arr));
    }

    static void sortInDescendingOrder()
    {
        Integer[] arrNonPrimitive = {1,4,5,2,5,6,2,6,5};
        Arrays.sort( arrNonPrimitive , Collections.reverseOrder());
        System.out.println(Arrays.toString(arrNonPrimitive));
    }

    static void onlyReverseArray()
    {
        Integer[] arrNonPrim = {1,3,42,2,7,4,2,5};
        Collections.reverse(Arrays.asList(arrNonPrim));
        System.out.println(Arrays.toString(arrNonPrim));
    }

    static void onlyReverseWithPrimitive()
    {
        int[] arrPrim = {1,2,3,4,5,65,6};
        int len = arrPrim.length;
        int[] rev = new int[len];

        for(int i=0 ; i<arrPrim.length ; i++ ){
            rev[len-1] = arrPrim[i];
            len--;
        }

        System.out.println(Arrays.toString(rev));
    }

    public static void main(String[] args) {
        //sortAnArray();
        sortSubArray();
        sortInDescendingOrder();
        onlyReverseArray();
        onlyReverseWithPrimitive();
    }

}
