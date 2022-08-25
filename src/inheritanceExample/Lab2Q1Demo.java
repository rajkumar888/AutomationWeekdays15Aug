package inheritanceExample;

public class Lab2Q1Demo {
	
	int instancedemoX=100;
	
	static int staticDemo= 200;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int localVariableDemo=500;
		
		
		System.out.println("value of local variable "+localVariableDemo);
		
		
		System.out.println("Value of Static Variable "+Lab2Q1Demo.staticDemo);
		System.out.println("Value of Static Variable "+staticDemo);
		
		Lab2Q1Demo obj = new Lab2Q1Demo();
		System.out.println("Value of instance Variable "+obj.instancedemoX);
		System.out.println("Value of instance Variable "+new Lab2Q1Demo().instancedemoX);
		
		
		
		
	}

}
