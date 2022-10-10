package exceptiondemo2;

public class StackOverFlowErrorDemo {

	static int i=1;
	public void show() throws InterruptedException{
		System.out.println(i++);
//		Thread.sleep(100);
		show();
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
		
		obj.show();
	}

}
