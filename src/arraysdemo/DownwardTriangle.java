package arraysdemo;

public class DownwardTriangle {

	public static void main(String[] args) throws InterruptedException {

		for (int row = 1; row <= 10; row++) {

			for (int col = 10; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
