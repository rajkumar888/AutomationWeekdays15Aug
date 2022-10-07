package exceptiondemo2;

public class JavaExceptionExample {

	public static void main(String args[]) {

//		try {
//			int data = 100 / 0;
//			System.out.println("try block is executed successfully");
//		}
//
//		catch (ArithmeticException obj) {
//			System.out.println(obj);
//			System.out.println("catch block is executed ");
//		}
//
//		finally {
//			System.out.println("Finally block is executed ");
//		}

		System.out.println("........................");
		
		String s = "abc";

		try {
			int i = Integer.parseInt(s);

			System.out.println("try block is executed successfully");
			
		} catch (NumberFormatException num) {
			num.printStackTrace();
			System.out.println("catch block is executed ");

		}finally {
			System.out.println("Finally block is executed ");
		}

		System.out.println("end of program........................");

	}
}