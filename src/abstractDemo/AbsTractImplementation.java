package abstractDemo;

public class AbsTractImplementation extends AbstractDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AbstractDemo obj = new AbstractDemo();
		
		
		AbsTractImplementation obj1 = new AbsTractImplementation();
		
		obj1.method1();
		
		
	}

	@Override
	public void temp() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello inside AbsTractImplementation");
		
	}

	@Override
	public void showX() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Inside AbsTractImplementation  "+x);
		
	}

	
	
}
