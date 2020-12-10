package com.practise.core.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TestHere {
    @Test
    public void test(){
        List<EmployeeComparator> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new EmployeeComparator(123,"abc"));
        listOfEmployee.add(new EmployeeComparator(12,"abc"));
        listOfEmployee.add(new EmployeeComparator(23,"harshad"));
        listOfEmployee.add(new EmployeeComparator(13,"Deepak"));
        listOfEmployee.add(new EmployeeComparator(12,"Deepak"));
        listOfEmployee.add(new EmployeeComparator(12,"xyz"));

        Collections.sort(listOfEmployee,new EmployeeComparator.DoubleCompare());
        for (EmployeeComparator e : listOfEmployee)
        {
            System.out.println(e.getRollNo() + " : " + e.getName());
        }

        /*List<EmployeeComparator> asertList = new LinkedList<>();
        asertList.add(new EmployeeComparator(12,"Deepak"));
        asertList.add(new EmployeeComparator(13,"Deepak"));
        asertList.add(new EmployeeComparator(12,"abc"));
        asertList.add(new EmployeeComparator(123,"abc"));
        asertList.add(new EmployeeComparator(23,"harshad"));
        asertList.add(new EmployeeComparator(12,"xyz"));*/

        assertEquals(new Integer(12),listOfEmployee.get(0).getRollNo());
    }
}
