package inheritanceDemo;

public class ChildInsidePackage extends DefatultDemoPackOne{
	
	
	public static void main(String[] args) {
		
		ChildInsidePackage obj = new ChildInsidePackage();
		
		
		System.out.println(obj.getdefaultX());
		
		System.out.println(obj.getprotectedX());
		
		System.out.println(obj.getpublicX());
		
		System.out.println("__________________________");
		
		DefatultDemoPackOne obj1 = new ChildInsidePackage();
		
		System.out.println(obj1.getdefaultX());
		
		System.out.println(obj1.getprotectedX());
		
		System.out.println(obj1.getpublicX());
		
	}

}
