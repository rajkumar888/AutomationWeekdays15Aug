package constructorsdemo2;

public class ConstructorOverLoadingDemo {
	
	public int x=100;
	public char ch='A';
	
	// without any argument or default constructor
	public ConstructorOverLoadingDemo(){
		System.out.println(" no argument constructor");
		
	}
	
	protected ConstructorOverLoadingDemo(int x){
		System.out.println(" integer argument constructor");
	}
	
	// this() or super()
	
	public ConstructorOverLoadingDemo(char letter){
		System.out.println(" char argument constructor");
	}


	public ConstructorOverLoadingDemo(int x, char letter){
		System.out.println(" int and char argument constructor");
		this.x=x;
		this.ch=letter;
	}
	
	public ConstructorOverLoadingDemo(char letter, int x){
		this(100,'A');
		System.out.println(" char and int argument constructor");
	}
	
	 ConstructorOverLoadingDemo(int x, char letter, String name){
		System.out.println(" default int and char and String argument constructor");
	}
	
	
	public ConstructorOverLoadingDemo(ConstructorOverLoadingDemo obj){
		System.out.println(" copy constructor is called");
	}
	
	
}
