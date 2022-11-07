package methodOverriding;

public class ConstructorOverLoadingDemo {
	
	// without any argument
	public ConstructorOverLoadingDemo(){
		System.out.println(" no argument constructor");
		
	}
	
	protected ConstructorOverLoadingDemo(int x){
		System.out.println(" integer argument constructor");
	}
	
	protected ConstructorOverLoadingDemo(long x){
		System.out.println(" Long argument constructor");
	}
	
	public ConstructorOverLoadingDemo(char letter){
		System.out.println(" char argument constructor");
		
	}


	public ConstructorOverLoadingDemo(int x, char letter){
		System.out.println(" int and char argument constructor");
		
	}
	
	ConstructorOverLoadingDemo(int x, char letter, String name){
		System.out.println(" default int and char and String argument constructor");
	}
	
	
	public ConstructorOverLoadingDemo(char letter, int x){
		System.out.println(" char and int argument constructor");
		
	}
	
	
	public ConstructorOverLoadingDemo(ConstructorOverLoadingDemo obj){
		System.out.println(" copy constructor is called");
		
	}
	
	
}
