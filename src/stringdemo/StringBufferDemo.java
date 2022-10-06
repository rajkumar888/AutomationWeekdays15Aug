package stringdemo;

import java.util.Date;

public class StringBufferDemo {

	public static void main(String[] args) {

		String str = "Hello";

		StringBuffer sb = new StringBuffer("Hello");
		
		
//		System.out.println( sb);
		sb.append(" World");
//		System.out.println( sb);
////
//		System.out.println("....................");
////
//		System.out.println(str);
//		str.concat(str);
//		System.out.println(str);
////
//		System.out.println("....................");
		StringBuilder sbuild = new StringBuilder("Hello");

//		System.out.println( sbuild);
		sbuild.append(" World");
//		System.out.println( sbuild);

		System.out.println(sb.reverse());
//		
		System.out.println(sbuild.reverse());
		System.out.println("todays date and time is "+new Date());
	}

}
