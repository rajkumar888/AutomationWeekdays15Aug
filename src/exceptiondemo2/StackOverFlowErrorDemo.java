package exceptiondemo2;

public class StackOverFlowErrorDemo {

	static int i=1;
	void show(){
		System.out.println(i++);
		show();
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
		
		obj.show();
	}

}
