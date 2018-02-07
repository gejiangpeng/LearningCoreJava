package Chapter4;

class Employee2{
	private static int nextID = 1;
	private String name;
	private int id;
	private double salary;
	
	public Employee2(String n, double s) {
		name=n;
		salary=s;
		id=0;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		id=nextID;
		nextID++;
	}
	public static int getNextId() {
		return nextID;
	}
	
	public static void main(String[] args) {
		Employee2 e = new Employee2("harry", 10000);
		System.out.println(e.getName()+" "+ e.getSalary());
	}
}

public class StaticTest{
	public static void main(String[] args) {
		Employee2[] staff = new Employee2[3];
		staff[0]=new Employee2("Tom", 40000);
		staff[1]=new Employee2("Dick", 60000);
		staff[2]=new Employee2("Harry", 65000);
	
		for(Employee2 e:staff) {
			e.setId();
			System.out.println("name="+e.getName());
			System.out.println("id="+e.getId());
			System.out.println("salary="+e.getSalary());	
		}
	int n=Employee2.getNextId();
	System.out.println("Next available Id is:"+n);
	}
}