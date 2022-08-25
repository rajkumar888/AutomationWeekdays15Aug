package stringdemo;

import java.util.Date;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";

		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("value before append " + sb);
		sb.append(" World");
		System.out.println("value before append " + sb);

		System.out.println("....................");

		System.out.println(str);
		str.concat(str);
		System.out.println(str);

		System.out.println("....................");
		StringBuilder sbuild = new StringBuilder("Hello");

		System.out.println("value before append " + sbuild);
		sbuild.append(" World");
		System.out.println("value before append " + sbuild);

		
		System.out.println("todays date and time is "+new Date());
		
		
		System.out.println(sb.reverse());
		
		System.out.println(sbuild.reverse());
	}

}
