package stringdemo;

public class ReverseStringExample1 {
	
	// recursive function to reverse a string
	public String reverseString(String str) {
		// checks if the string is empty
		if (str.isEmpty()) {
//			System.out.println("String is empty.");
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}
	
	
	public static void main(String[] args) {
		ReverseStringExample1 rs = new ReverseStringExample1();
		
		String resultantSting1 = rs.reverseString("JAVATPOINT"); 
		
//		String resultantSting2 = rs.reverseString("COMPUTER");  
		
//		String resultantSting3 = rs.reverseString("INDIA");  
		
		System.out.println(resultantSting1);  
//		System.out.println(resultantSting2);  
//		System.out.println(resultantSting3);
		
		int x=10;
		
		Integer i = 100;
		
		Integer i1 = new Integer(100);
		
		Integer i2= new Integer("300");
		
		
		
		
		
		
	}
}