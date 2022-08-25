package labExercise;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=5000;
		int b=2000;
		int c=5500;
		
		
		if(a>b && a>c){
			System.out.println("Greatest Number is "+a);
		}else if(b>c){
			System.out.println("Greatest Number is "+b);
		}else{
			System.out.println("Greatest Number is "+c);
		}

	}

}
