package labExercise;

public class SwapTwoFloadVariablesDemo {

	public static void main(String[] args) {
		
		
		float x=10.5f;
		
		float y=20.5f;
		
//		float temp=0.0f;
		
		System.out.println("Value of x and y "+x+"   "+y);
		
//		temp=y;
		
//		y=x;
		
//		x=temp;
		
//		System.out.println("Value of x and y "+x+"   "+y);
		
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x and y "+x+"   "+y);
		

	}

}
