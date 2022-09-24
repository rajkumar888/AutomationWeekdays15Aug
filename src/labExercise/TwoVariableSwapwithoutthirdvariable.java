package labExercise;

public class TwoVariableSwapwithoutthirdvariable {

	public static void main(String[] args) {

		
		float var1=100.25f;
			
		float var2=200.44f;
		
		
		System.out.println("Var1 "+var1);
		System.out.println("Var2 "+var2);
		
//		float var3=var1;
//		
//		var1=var2;
//		
//		var2=var3;
		
		var1=var1+var2;
		
		var2=var1-var2;
		
		var1=var1-var2;
		
		
		
		System.out.println(" after swapping the value....");
		
		System.out.println("Var1 "+var1);
		System.out.println("Var2 "+var2);
		
		
		
	}

}
