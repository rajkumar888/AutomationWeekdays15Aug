package stringdemo;

public class CharCount {

	public static void main(String[] args) {
		
		String str1 = "Hello World Java Learning";
		
		str1=str1.toLowerCase();
		

		int beforelength = 0;
		int currentlength = 0;

//		for (int i = 97; i <= 122; i++) {
//			char ch = (char) i;
//
//			beforelength = str1.length();
//			
//			str1 = str1.replaceAll(String.valueOf(ch), "");
//			
//			currentlength = str1.length();
//			
//			int diff = beforelength - currentlength;
//			
//			if (diff > 0) {
//				System.out.println("Character " + ch + " :-> " + diff);
//			}
//		}
		
		System.out.println("................");
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println("Character " + i + " :-> " + (str1.length() - str1.replaceAll(String.valueOf(i), "").length()));
		}

	}
}
