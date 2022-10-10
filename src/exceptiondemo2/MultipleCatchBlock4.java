package exceptiondemo2;

public class MultipleCatchBlock4 {

	public static void main(String[] args) {

		try {
			String s = null;
//			int x=100/0;
//			System.out.println(s.length());
			
			System.out.println("hello world.......");
//			System.exit(0);
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} 
		
		catch (NullPointerException e) {
			System.out.println("NullPointerException Exception occurs");
		}
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		
		finally{
			System.out.println("finally block executed");
		}
		
		
		System.out.println("rest of the code.............");
	}
}