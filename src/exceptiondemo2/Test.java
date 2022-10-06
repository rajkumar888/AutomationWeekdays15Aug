package exceptiondemo2;

public class Test {

	public void m1(){
		
		System.out.println("inside m1");
		m2();
	}
	
	public void m2(){
		System.out.println("inside m2");
		m1();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test();
		
		obj.m1();
		
	}

}
