package inheritanceDemo;



public class PublicAccessModifierDemo {
	int x;
	
	private int temp=200;

	public void showX() {

		System.out.println("value of x " + x);
	}
	
	private void showTemp() {

		System.out.println("value of temp " + temp);
	}

	public PublicAccessModifierDemo() {

		this.x = 500;
		System.out.println("Default constructor is invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicAccessModifierDemo obj = new PublicAccessModifierDemo();
		
		obj.showX();
		
//		System.out.println(obj.temp);
		
		obj.showTemp();

	}

}
