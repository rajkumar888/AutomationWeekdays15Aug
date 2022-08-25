package ifelsedemo;

public class SwitchCaseExample {

	public static void main(String[] args) {

		char ch = 'b';

		switch (ch) {
		
		default:
			System.out.println("Consonant..");
			break;

		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Vowel");
//			break;
		} // end of switch

	}

}
