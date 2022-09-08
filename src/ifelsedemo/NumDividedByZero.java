package ifelsedemo;

public class NumDividedByZero {

	int x=100;
	static int y=200;
		
	public void display(){
		System.out.println(x);
		System.out.println(NumDividedByZero.y);
	}
	
	{
		System.out.println(x);
		System.out.println(NumDividedByZero.y);
	}
	
	static{
		System.out.println(new NumDividedByZero().x);
		System.out.println(NumDividedByZero.y);
	}
	
	public static void test(){
		System.out.println(new NumDividedByZero().x);
		System.out.println(NumDividedByZero.y);
	}
	
	public static void main(String[] args) {
		System.out.println(new NumDividedByZero().x);
		System.out.println(NumDividedByZero.y);

	}

}
