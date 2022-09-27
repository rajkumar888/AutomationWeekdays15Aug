package arraysdemo;

public class TrianglePrint0to9 {
	
	
	//0
	//12
	//345
	//6789

	public static void main(String[] args) throws InterruptedException {

		int num=0;
		
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print((num++)+" ");
			}
			System.out.println();
		}
	}

}
