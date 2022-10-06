package exceptiondemo2;

public class ThrowDemo {

	public static void main(String args[]) {

		int age = 5;
		
		try{
			if (age < 18) {
				// throw Arithmetic exception if not eligible to vote
				throw new RuntimeException("Person is not eligible to vote");
//				throw new RuntimeException();
			} else {
				System.out.println("Person is eligible to vote!!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(" end of program...");
	}
}
