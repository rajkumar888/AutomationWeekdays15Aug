package exceptiondemo2;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 5;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		
		catch(RuntimeException rte){
			System.out.println("RuntimeException occurs");
		}

		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		
		System.out.println("end of program................");
	}
}