package ifelsedemo;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=11;
		int b=20;
		int c=50;
		
		
		if(a>b && a>c){
			System.out.println("Greatest Number is "+a);
		}else if(b>c){
			System.out.println("Greatest Number is "+b);
		}else{
			System.out.println("Greatest Number is "+c);
		}

	}

}
