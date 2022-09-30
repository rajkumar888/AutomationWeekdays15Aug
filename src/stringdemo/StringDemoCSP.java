package stringdemo;

public class StringDemoCSP {

	public static void main(String[] args) {
		
		// string literals
		String str5 = "Welcome"; 		//csp
		String str6 = "Welcome";
		
//		System.out.println(str5.equals(str6)); // value comparison
		System.out.println(str5==str6); 
//		System.out.println(str5.intern()==str6.intern());
		

		String str1=new String("Hello");	// two objects created
		String str2=new String("Hello");	// one object created
		
//		System.out.println(str1.equals(str2)); // value comparison
		System.out.println(str1==str2); 
		System.out.println(str1.intern()==str2.intern());
	
		System.out.println(str1);
		System.out.println(str1);
		System.out.println("..............");
		System.out.print(str1);
		System.out.print(str1);
	}

}
