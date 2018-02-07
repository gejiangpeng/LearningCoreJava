package Chapter5.arrayList;

import java.util.*;

/**
*This program demostrates the ArrayList class.
*@version 11.9 2017-11-09
*@auther Francis Jiang
**/

public class ArrayListTest{
	public static void main(String[] args) {
		ArrayList<Employee> staff=new ArrayList<Employee>();
		
		staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
		
		//raise everyone's salary by 5%
		for(Employee e:staff) {
			e.raiseSalary(5);
		}
		
		//print out information about all Employee objects
		
		for(Employee e:staff) {
			System.out.println("name="+e.getName()+",Salary="+e.getName()+",hireDay="+e.getHireDay());
		}
	}
}