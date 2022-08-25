package com.pack.day7;

import java.util.Date;

public class ForLoopDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// for(int i=1; i<=100; i=i+2 ){
		// System.out.print(i+", ");
		// }

		// for(int j=100; j>=1 ; j=j-2){
		// System.out.print(j+", ");
		// }

		// int k=1;
		// System.out.println(k++);
		// System.out.println(k++);
		// System.out.println(k++);
		// System.out.println(k++);
		// System.out.println(k++);
		// System.out.println(k++);

//		int i = 1;
//		while (i <= 100) {
//			System.out.print(i + ", ");
//			i = i + 2;
//		}
		
		int count=10;
		int i=0;
		
		while(true){
			if (i++<=count){
				System.out.println("Date time is "+new Date());
				Thread.sleep(2000);
			}else{
				break;
			}
		}
		
	}

}
