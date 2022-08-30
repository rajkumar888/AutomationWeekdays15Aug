package labExercise;

public class ThreeVariablesDemo {
	
	
	String name="Hello Java";
	
	int number=1001;
	
	boolean flag=true;
	
	
	public void display(){
		
		System.out.println("Given Name : "+name);
		System.out.println("Given Number : "+ number);
		System.out.println("Given flag : "+flag);
	}
	
	

	public static void main(String[] args) {
		ThreeVariablesDemo obj = new ThreeVariablesDemo();
		
		obj.display();

	}

}
