package inheritanceDemo;

public class Lab2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float x=20.56f;
		float y=30.56f;
		
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
		
//		float z=0.0f;
//		System.out.println("Value of z "+z);
//		
//		z=x;
//		x=y;
//		y=z;
//		System.out.println("Value of x "+x);
//		System.out.println("Value of y "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("...................");
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);

	}

}
