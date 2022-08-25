package ifelsedemo;

public class GradingDemoUsingIfElseIf {

	public static void main(String[] args) {

		int marks=100;
		
		// marks >=90 - A
		// marks <=89 and marks >= 80 - B
		// marks <=79 and marks >=70 - C
		// marks <= 69 and marks >= 60 - D
		// marks <=59 - fail
		
	
//		if(marks>=90){
//			System.out.println("Grade A");
//		} else if(marks>=80){
//			System.out.println("Grade B");
//		}else if(marks>=70){
//			System.out.println("Grade C");
//		}else if(marks>=60){
//			System.out.println("Grade D");
//		}else{
//			System.out.println("Grade F");
//		}
		
		
		if(marks>=90 && marks<=100){
			System.out.println("Grade A");
		} else 	if(marks<=89 && marks>=80){
			System.out.println("Grade B");
		} else 	if(marks<=79 && marks>=70){
			System.out.println("Grade C");
		} else 	if(marks<=69 && marks>=60){
			System.out.println("Grade D");
		} else{
			System.out.println("Grade F");
		}
		
		
		System.out.println("end of program......");
		
	}

}
