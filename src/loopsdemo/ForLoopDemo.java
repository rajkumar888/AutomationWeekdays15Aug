package loopsdemo;

import java.util.Date;

public class ForLoopDemo {

	public static void main(String[] args) throws InterruptedException {

		// for( int i=1 ; i<=10 ; i++){
		// System.out.println(new Date()+"......."+i);
		// Thread.sleep(1000);
		// }

		// for (int i = 10; i >= 1; i--) {
		// System.out.println("The value of i is: " + i);
		// }

		// int i=1;
		// while(i<=10 ){
		// System.out.println(new Date()+"......."+(i++));
		// Thread.sleep(1000);
		// }

//		int i = 1;
//		for (; i <= 10;) {
//			System.out.println(new Date() + "......." + (i++));
//			Thread.sleep(1000);
//		}

		
		 int i=1;
		 do{
		 System.out.println(new Date()+"......."+(i++));
		 Thread.sleep(500);
		 }while(i<=10);
		 
//		 int x=15, y=20;
//		 
//		 x=(x<y) ? (y+x) : (y-x);
//		 
//		 System.out.println(x);

	}

}
