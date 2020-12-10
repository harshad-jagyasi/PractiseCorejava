package com.practise.core.logic;

import java.util.*;
import java.util.stream.Collectors;

public class LargestInArray {

    static int[] arr = {1,2,3,4,5,5,5,5,5,5,6,6,8,7,9,0,78,7,7,8,7,9};

    public int largest()
    {
        int max = Arrays.stream(arr).max().getAsInt();
        boolean a = max !=0 ? true : false;
        System.out.println(a);

        return max;
    }

    public static void largestInList(){
        List<Integer> listInt = new ArrayList<>();
        listInt.add(9);
        listInt.add(2);
        listInt.add(-1);
        listInt.add(4);
        listInt.add(5);
        listInt.add(7);
        int max = listInt.get(0);
        /*Iterator itr = listInt.iterator();
        while (itr.hasNext()){
            if(max<(itr.next()))
            {

            }
        }*/
        for(Integer i : listInt){
            if(max<i){
               max =i;
            }
        }

        //System.out.println("max is : " + max);

        Integer[] arr5 = new Integer[]{1,2,2,3,4,5,67,8};
        List<Integer> arr1 = new ArrayList<>();
        arr1 = Arrays.asList(arr5);

        for(Integer i : arr1)
        {
            System.out.print(i + ", ");
        }
        System.out.println();

        int max1 = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max in Array : " + max1);

        Integer maxByCollection = Collections.max(listInt);
        System.out.println("Max : " + maxByCollection);

        Collections.reverse(listInt);
        System.out.println("Reverse : " + listInt);

        Collections.sort(listInt);
        System.out.println("Sort : " + listInt);


        //

    }

    public static void largestByOldJava(){
        int max = arr[0];

        for(int i=1 ; i<arr.length ; i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("By for max is : " + max );
    }

    private static Set<Integer> findDuplicatesUsingJava8(int[] inputArray)
    {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        //System.out.println(duplicateElements);
        return duplicateElements;
    }

    public static List<String> sortString()
    {
        List<String> list = Arrays.asList("how","to","sort","list");
        //list.add("stresxa");
        List<String> str = list.stream().sorted(String::compareTo).collect(Collectors.toList());
        List<String> str1 = list.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        return str1;
    }

    public static void createList(){
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);

        Iterator itr = newList.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }

    }

    public static void main(String[] args) {
        LargestInArray larg = new LargestInArray();
        /*System.out.println("largest number is : " + larg.largest() );
        System.out.println("duplicate are " + findDuplicatesUsingJava8(arr).toString());
        System.out.println(sortString());
        largestByOldJava();
        createList();*/

        largestInList();
    }
}
