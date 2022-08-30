package encapsulationdemo;

public class EncapImplOtherClass {
	
	
	
	public static void main(String[] args) {
		
		EncapsulationDemoClass obj111 = new EncapsulationDemoClass();
		
		
		System.out.println(obj111.getName());
		System.out.println(obj111.getAge());
		
		obj111.setName("Computer");
		obj111.setAge(40);
		
		System.out.println(obj111.getName());
		System.out.println(obj111.getAge());
	}
}
