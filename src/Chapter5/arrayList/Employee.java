package Chapter5.arrayList;

import java.time.*;

public class Employee{
	private String name;
	private double Salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name=name;
		this.Salary=salary;
		hireDay=LocalDate.of(year, month, day);
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return Salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void raiseSalary(double byPercent) {
		double raise=Salary*byPercent/100;
		Salary+=raise;
	}
}

