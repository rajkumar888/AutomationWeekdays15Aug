package exceptiondemo2;

public class NullPointerException111 {

	static NullPointerException111 obj1;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Start of the program");
		
		try {
//			System.out.println(obj1.hashCode());
			Thread.sleep(5000);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		
		finally{
			System.out.println("inside of finally block");
		}
		
		
		
////		NullPointerException111 obj = new NullPointerException111();
//		
//		System.out.println(obj1);
//		
//		System.out.println(obj1.hashCode());
		System.out.println("End of the program");

	}

}

