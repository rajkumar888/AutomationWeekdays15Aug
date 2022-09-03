package stringdemo;

public class MatchesExample {

	   public static void main(String args[]) {
		   
	      String Str = new String("Welcome to Tutorialspoint.com");

//	      System.out.print("Return Value :" );
//	      System.out.println(Str.matches("(.*)Tutorials(.*)"));

//	      System.out.print("Return Value :" );
//	      System.out.println(Str.matches("Tutorials"));
//
//	      System.out.print("Return Value :" );
//	      System.out.println(Str.matches("Welcome(.*)"));
//	      
//	      
//	      String regex = "^J..a$";
//
//	      System.out.println("Java".matches(regex));
	      
	      
//	      String regex = "^[0-9]+$";
//
//	      System.out.println("123a".matches(regex)); // false
//	      System.out.println("98416".matches(regex)); // true
//	      System.out.println("98 41".matches(regex)); // false
//	      
//	      regex = "^[A-Z]+|[a-z]+|[0-9]+$";
//	      System.out.println("HELLO".matches(regex)); // TRUE
//	      System.out.println("hello".matches(regex)); // false
////	      System.out.println("111hello222".matches(regex)); // false
	      
//	      
	      String mobileregex="\\d{3}-\\d{3}-\\d{4}";
	      String str = "799-999-9998";  
	      System.out.println(str.matches(mobileregex));
	      
	      
	      
	      
	   }
	}