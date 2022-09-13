package loopsdemo;

import java.util.Date;

public class ForLoopWithBreakContinue {

	public static void main(String[] args)  {

//		for (int i = 1; i <= 100; i++) {
//			System.out.println(new Date() + "......." + i);
//			
//			if(i==50){
//				break;
//			}
//		}
		
		char ch='A';
		
		for(int i=1;i<100;i++){
			if(ch>90 && ch<97){
				ch++;
				continue;
			}
			if(ch>122){
				break;
			}
			System.out.print((ch++)+" ");
		}
		

	}

}
