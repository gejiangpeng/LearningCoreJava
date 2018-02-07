package Chapter4;
import java.time.*;

public class EmployeeTest{
	public static void main(String[] args) {
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("Carl Cracker",75000, 1987, 12, 15);
		staff[1]=new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2]=new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		for(Employee e: staff) {
			e.raiseSalary(0.1);
		}
		for(Employee e: staff) {
			System.out.println(e.getName() + e.getHireDay()+ e.getSalary());
		}
	}
}

class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	public Employee(String n, double s, int year, int month, int day) {
		name=n;
		salary=s;
		hireDay=LocalDate.of(year, month, day);
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void raiseSalary(double byPercent) {
		salary*=(1+byPercent);
	}
}