package arraysdemo;

public class TrianglePrint0to9ReverseOrder {
	
	
	//0123
	//456
	//78
	//9

	public static void main(String[] args) throws InterruptedException {

		int num=0;
		
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5-row; col++) {
				System.out.print((num++)+" ");
			}
			System.out.println();
		}
	}

}
