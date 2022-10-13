package finalfinallyfinalize;

public class CharCountDemo {

	public static void main(String[] args) {

		String str = "Hello Welcome to Java Learning Program";

		str = str.toLowerCase();
		
		System.out.println(str);

		for (int i = 97; i <= 122; i++) {

			int count = 0;
			char ch = (char) i;
			count = str.length() - str.replaceAll(String.valueOf(ch), "").length();
			
//			System.out.println("Count of Character " + ch + " is " + count);
			
			if(count>=1){
				System.out.println("Count of Character " + ch + " is " + count);	
			}
		}
		System.out.println();
	}
}
