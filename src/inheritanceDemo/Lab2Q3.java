package inheritanceDemo;

public class Lab2Q3 {
	
	int x;
	float y;
	
	public Lab2Q3(){
		x=100;
		y=20.5f;
		System.out.println("Default constructor invoked...");
	}
	
	public Lab2Q3(int x, float y){
		this.x=x;
		this.y=y;
		System.out.println("Parameterized constructor invoked...");
	}
	
	public void show(){
		System.out.println("...............");
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
	}
	
	public void setterMethod(int x, float y){
		this.x=x;
		this.y=y;
		System.out.println("parameterized method invoked...");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab2Q3 obj = new Lab2Q3();
		
		obj.show();
		obj.setterMethod(25, 86.4f);
		obj.show();
		
		obj.setterMethod(30, 66.4f);
		obj.show();
		
//		Lab2Q3 obj1 = new Lab2Q3();
//		obj1.show();
		
		
		Lab2Q3 obj4 = new Lab2Q3();
		Lab2Q3 obj2 = new Lab2Q3(20,77.6f);
		obj2.show();
		
	}

}
