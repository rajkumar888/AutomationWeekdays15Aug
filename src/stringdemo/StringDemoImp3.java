package stringdemo;

public class StringDemoImp3 {

	public static void main(String[] args) {
		
		
		
		String str1=new String("Hello World Java Learning");
		
		String str2=str1.toUpperCase();
		
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(22));
		
		for(int i=0; i<str1.length(); i++){
			System.out.print(str1.charAt(i));
		}
		
		System.out.println("\n....");
		for(int i=str1.length()-1; i>=0 ; i--){
			System.out.print(str1.charAt(i));
		}
		
		System.out.println("\n....");
		
		System.out.println(str1.substring(10));
		
		System.out.println(str1.substring(10,11));
		
		System.out.println(str1.indexOf('o',6));
		System.out.println(str1.indexOf("World"));
		
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.contains("World"));
		
		String str888="   Computer        ";
		String str999="Keyboard";
		
		System.out.println(str888.compareTo(str888));
		System.out.println("...................");
		System.out.println(str888.length());
		
		String str000=str888.trim();
		System.out.println("...................");
		System.out.println(str888.length());
		System.out.println(str000.length());
		System.out.println(str000);
		
		
		System.out.println(str888.replace(' ', '.'));
		
		
		String replacedemo="Hello world Java Hello world Java 1234";
		
		
		System.out.println(replacedemo.replaceAll("\\d", ""));
		System.out.println(replacedemo.replaceAll("\\D", ""));

		System.out.println(str888.replaceAll("\\s", ""));
		
		System.out.println(replacedemo.replaceAll("\\s", ""));
		
		System.out.println("..................");
		
		String xyz="";
		
		System.out.println(xyz.isEmpty());
		
		
	}

}
