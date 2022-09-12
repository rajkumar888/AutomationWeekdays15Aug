package ifelsedemo;

public class VowelOrConsonantDemo {

	public static void main(String[] args) {

		char ch='X';
		
		
		if(ch=='A' || ch=='a' || ch == 'E'|| ch == 'e'|| ch == 'I'|| ch == 'i'|| ch == 'O'|| ch == 'o' || ch == 'U'|| ch == 'u'){
			System.out.println("Vowel......");
		}else{
			System.out.println("Consonant.....");
		}
		
		
		String str="the quick brown fox";
		
		
		if(str.contains(String.valueOf(ch))){
			System.out.println("Charcter is found "+ch);
		}else{
			System.out.println("Charcter is not found "+ch);
		}
		
		
		
		
	}

}
