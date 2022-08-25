package com.pack.day7;

import java.util.Date;

public class DoWhileDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int i=1;
		
		do{
			System.out.println(new Date());
			Thread.sleep(1000);
		}while(i++<10);

	}

}
