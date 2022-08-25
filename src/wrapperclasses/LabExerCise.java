package wrapperclasses;

public class LabExerCise {

	public static void main(String[] args) {

		String str1="Hello";
		
		String str2="hello";
		
		String str3="hello";
		
		System.out.println(str2==str3);
		
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(".......................");
		String str4 = new String("World");
		String str5 = new String("World");
		String str6 = new String("world");
		System.out.println(str4.equals(str5));
		System.out.println(str4==str5);
		System.out.println(str4.intern()==str5.intern());
		
		System.out.println(str5.equals(str6));
		System.out.println(str5.equalsIgnoreCase(str6));
	}

}
