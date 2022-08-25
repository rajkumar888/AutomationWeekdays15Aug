package stringdemo;

public class StringBufferExample2 {
	
	public static void main(String args[]) {
		
		StringBuffer sb = new StringBuffer("HelloWorld");
		
//		sb.insert(1, "Java");// now original string is changed
		
//		System.out.println(sb);// prints HJavaello
		
		
//		sb.replace(1,3,"Java");  
//		System.out.println(sb);//prints 
		
		
		sb.delete(1,3);  
		System.out.println(sb);//prints
	}
}