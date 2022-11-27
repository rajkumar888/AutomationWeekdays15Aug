package comparatordemo;


public class Developer {
	
	private String name;
	private int Salary;
	private int age;
	
	public String getName() {
		return name;
	}

	public int getSalary() {
		return Salary;
	}

	public int getAge() {
		return age;
	}

	public Developer(String name,int Salary,  int age) {
		this.Salary = Salary;
		this.name = name;
		this.age = age;
	}

	public Developer() {

	}
}
