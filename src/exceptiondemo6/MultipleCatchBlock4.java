package exceptiondemo6;

public class MultipleCatchBlock4 {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} 
		
		catch (NullPointerException e) {
			System.out.println("NullPointerException Exception occurs");
		}
		
		catch (RuntimeException e) {
			System.out.println("NullPointerException Exception occurs");
		}
		
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
			
			try{
			System.out.println();	
			}
			catch(Exception e1){
				System.out.println("inside nested catch Exception occurs");
			}
			
		}
		
		
		System.out.println("rest of the code");
	}
}
