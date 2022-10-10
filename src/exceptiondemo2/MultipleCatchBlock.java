package exceptiondemo2;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
//			System.out.println("Arithmetic or array out of bounds Exception occurs");
		}

		catch (RuntimeException rte) {
			System.out.println("RuntimeException occurs");
		}

		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}

		System.out.println("end of program................");
	}
}