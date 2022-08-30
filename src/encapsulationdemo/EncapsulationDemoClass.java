package encapsulationdemo;

public class EncapsulationDemoClass {
	
	// encapsulation

	private String name = "Hello";

	private int age = 30;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
//	public static void main(String[] args) {
//		
//		EncapsulationDemoClass obj = new EncapsulationDemoClass();
//		
//		System.out.println(obj.age);
//		
//		System.out.println(obj.getAge());
//		
//		System.out.println(obj.name);
//		
//		System.out.println(obj.getName());
//		
//	}
}
