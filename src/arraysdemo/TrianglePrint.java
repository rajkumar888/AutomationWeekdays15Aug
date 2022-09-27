package arraysdemo;

public class TrianglePrint {

	public static void main(String[] args) throws InterruptedException {

		for(int row=1; row<=10; row++){
			
			for(int s=9; s>=row; s--){
				System.out.print(" ");
			}
//			
			for(int col=1; col<=row; col++){
				System.out.print("*");
				
			}
			
			
			System.out.println();
//			Thread.sleep(1000);
		}
	}

}
