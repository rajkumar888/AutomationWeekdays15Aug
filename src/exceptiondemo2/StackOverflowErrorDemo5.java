package exceptiondemo2;

public class StackOverflowErrorDemo5 {

	public void m1(){
		
		System.out.println("inside m1");
		m2();
	}
	
	public void m2(){
		System.out.println("inside m2");
		m1();
	}
	
	
	
	public static void main(String[] args) {

		StackOverflowErrorDemo5 obj = new StackOverflowErrorDemo5();
		
		try {
			obj.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
