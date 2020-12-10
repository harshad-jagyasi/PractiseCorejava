package com.practise.core.logic;

import java.util.*;

public class EmployeeComparator {
    private int rollNo;
    private String name;

    public EmployeeComparator(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static class SortbyName implements Comparator<EmployeeComparator> {

        public int compare(EmployeeComparator a , EmployeeComparator b){
            return a.getName().compareTo(b.getName());
        }

    }

    static class ReverseSortByRollNo implements Comparator<EmployeeComparator>{
        public int compare(EmployeeComparator a , EmployeeComparator b){
            return b.getRollNo()-a.getRollNo();
        }
    }

    static class DoubleCompare implements Comparator<EmployeeComparator>{
        public int compare(EmployeeComparator a , EmployeeComparator b){
            int Name = a.getName().compareTo(b.getName());
            int RollNo = a.getRollNo().compareTo(b.getRollNo());

            if(Name ==0)
            {
                return ((RollNo==0)?Name:RollNo);
            }
            else
                return Name;
        }
    }

    public static void main(String[] args) {
        /*List<EmployeeComparator> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new EmployeeComparator(123,"abc"));
        listOfEmployee.add(new EmployeeComparator(23,"harshad"));
        listOfEmployee.add(new EmployeeComparator(13,"Deepak"));
        listOfEmployee.add(new EmployeeComparator(12,"xyz"));*/
//        Collections.sort(listOfEmployee,new SortbyName());
//
//        for (EmployeeComparator e : listOfEmployee)
//        {
//            System.out.println(e.getRollNo() + " : " + e.getName());
//        }
//
//        System.out.println("Now By Roll No");
//
//        Collections.sort(listOfEmployee,new ReverseSortByRollNo());
//
//        for (EmployeeComparator e : listOfEmployee)
//        {
//            System.out.println(e.getRollNo() + " : " + e.getName());
//        }
    }
}
