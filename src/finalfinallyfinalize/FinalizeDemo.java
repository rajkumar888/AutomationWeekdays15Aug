package finalfinallyfinalize;

import java.io.IOException;
import java.util.Date;

public class FinalizeDemo {
	
	
	public FinalizeDemo(){
		System.out.println("FinalizeDemo Consturctor is invoked....");
	}

	
	protected void finalize() throws Throwable {
		System.out.println("finalize method from FinalizeDemo class is invoked....");
	}
	

	public static void main(String[] args) throws IOException {
		
		FinalizeDemo obj = new FinalizeDemo();
		FinalizeDemo obj1 = new FinalizeDemo();
		
		new FinalizeDemo(); 		// anonymous
		new FinalizeDemo();
		new FinalizeDemo();
		
//		System.out.println(".........................");
		System.gc();
////		
//		 Runtime.getRuntime().gc();
//		 
//		 Runtime.getRuntime().exec("taskkill /F /T /IM notepad.exe");
		
		System.out.println("end of the program......................."+new Date());
		
	}

}
