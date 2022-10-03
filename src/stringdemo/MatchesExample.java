package stringdemo;

public class MatchesExample {

	   public static void main(String args[]) {
		   
//	      String Str = new String("Welcome to Tutorialspoint.com");
//
//	      System.out.println(Str.matches("(.*)Tutorials(.*)"));
//
//	      System.out.println(Str.matches("Tutorials"));
////
//	      System.out.println(Str.matches("Welcome(.*)"));
////	      
//	      
//	      String regex = "^J..a$";
//	      System.out.println("Java".matches(regex));
	      
	      
//	      String regex = "^[0-9]+$";
//	      System.out.println("12307763635535".matches(regex)); 
//	      System.out.println("123a".matches(regex)); // false
//	      System.out.println("98416".matches(regex)); // true
//	      System.out.println("98 41".matches(regex)); // false
//	      
//		   String regex = "^[A-Z]+|[a-z]+|[0-9]+$";
//	      System.out.println("HELLO".matches(regex)); // TRUE
//	      System.out.println("hello".matches(regex)); // TRUE
//	      System.out.println("111222".matches(regex)); // TRUE
	      
//	      
//	      String mobileregex="\\d{3,5}-\\d{3,5}-\\d{3,5}";
//	      String str = "7439-9949-99984";  
//	      System.out.println(str.matches(mobileregex));
	      
	      String str1="hello";
	      
	      System.out.println(str1.matches("[a-z]{3}"));
	      
	      String test="The quick brown khan is jumping over the lazy khan";
	      
	      
	      test=test.replaceAll("k", "K");
	      
	      System.out.println(test);
	      
	   }
	}