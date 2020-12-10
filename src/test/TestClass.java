package test;

import com.practise.core.logic.EmployeeComparator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(JUnit4.class)
public class TestClass {

    @Test
    public void testComparator()
    {
        List<EmployeeComparator> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new EmployeeComparator(123,"abc"));
        listOfEmployee.add(new EmployeeComparator(23,"harshad"));
        listOfEmployee.add(new EmployeeComparator(13,"Deepak"));
        listOfEmployee.add(new EmployeeComparator(12,"xyz"));

        //Collections.sort(listOfEmployee,new SortByName);
    }
}
