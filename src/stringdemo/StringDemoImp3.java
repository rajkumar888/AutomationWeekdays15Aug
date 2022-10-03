package stringdemo;

public class StringDemoImp3 {

	public static void main(String[] args) throws InterruptedException {
		
		String str1=new String("Hello World Java Learning");
		
		String str2=str1.toUpperCase();
		
//		System.out.println(str1.length());
//		System.out.println(str1);
//		System.out.println(str2);
		
//		System.out.println(str1.charAt(str1.length()-1));
//		System.out.println(str1.charAt(str1.length()-str1.length()));
		
//		for(int i=0; i<str1.length(); i++){
//			System.out.print(str1.charAt(i));
//			Thread.sleep(100);
//		}
////		
//		System.out.println("\n................");
//		
//		for(int i=str1.length()-1; i>=0 ; i--){
//			System.out.print(str1.charAt(i));
//			Thread.sleep(100);
//		}
		
//		System.out.println("\n....");
//		System.out.println(str1);
//		System.out.println(str1.substring(str1.length()/2));
////		
//		System.out.println(str1.substring(10,11));
//		
//		System.out.println(str1.indexOf('o',5));
//		System.out.println(str1.indexOf("World"));
//		
//		
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
////		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));
//		
//		System.out.println(str1.contains("World".toUpperCase()));
//		
		String str888="   Com   puter        ";
		
//		System.out.println(str888);
//		System.out.println(str888.length());
//		System.out.println(str888.trim());
//		System.out.println(str888.trim().length());
		
//		String str999="Keyboardcsd";
//		
//		System.out.println(str888.trim().compareTo(str999));
//		System.out.println("a".compareTo("A"));
//		System.out.println("...................");
//		System.out.println(str888.length());
//		
//		String str000=str888.trim();
//		System.out.println("...................");
//		System.out.println(str888.length());
//		System.out.println(str000.length());
//		System.out.println(str000);
//		
//		
//		System.out.println(str888.replace(' ', '.'));
//		
		String s1="My name is Khan. @ My 	+-#$name is Bob. My name is Sonoo. 12345 ";
		System.out.println(s1);
//		System.out.println(s1.replaceAll("\\s",""));
//		System.out.println(s1.replaceAll("\\S",""));
//		System.out.println(s1.replaceAll("\\d",""));
//		System.out.println(s1.replaceAll("\\D",""));
		
//		System.out.println(s1.replaceAll("\\w",""));
//		System.out.println(s1.replaceAll("\\W",""));
		
		System.out.println(s1.replaceAll("[abc]",""));
		System.out.println(s1.replaceAll("[^abc]",""));
		System.out.println(s1.replaceAll("[A-Z]",""));
		System.out.println(s1.replaceAll("[a-z]",""));
		System.out.println(s1.replaceAll("[0-9]",""));
		
//		
//		String replacedemo="Hello world Java Hello world Java 1234";
//		System.out.println(replacedemo.replaceAll("world", "Java"));
//		
//		System.out.println(replacedemo.replaceAll("\\d", ""));
//		System.out.println(replacedemo.replaceAll("\\D", ""));
//
//		System.out.println(str888.replaceAll("\\s", ""));
//		
//		System.out.println(replacedemo.replaceAll("\\s", ""));
//		
//		System.out.println("..................");
//		
		String xyz="";
//		
		System.out.println(xyz.isEmpty());
		System.out.println(xyz.length()==0);
		
		
	}

}
