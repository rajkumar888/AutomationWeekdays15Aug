package exceptiondemo2;

public class MultipleCatchBlock2 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 1;
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(" Exception occurs");
			e.printStackTrace();
		}
		catch(RuntimeException e){
			System.out.println("RuntimeException occurs");
		}
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("end of program................");
	}
}