package methodOverriding2;

public class StaticMethodOverloading {
	
	
	public final static void method1(){
		System.out.println("method 1 with no argument");
	}
	
	
	public final static void method1(int x){
		System.out.println("method 1 with int argument");
	}
	
	
	public static void method1(char x){
		System.out.println("method 1 with char argument");
	}
	
	
	public static void main(String[] args) {
		char ch[]={'A','B','C'};
		main(ch);
		double[] d = {11.5,12.2,11.1};
		main(d);
		method1('A');
		method1(10);
	}
	
	public static void main(char[] args) {
		System.out.println("character array main method is called");
	}
	
	
	public static void main(double[] args) {
		System.out.println("double array main method is called");
	}
	
}
