package stringdemo;

public class CharacterRangeLoowerUpper {

	public static void main(String[] args) {

		String str = "AbCdefGHijklMNOpqRstUVwxyZ123 @%*";

		// for (int i = 0; i < str.length(); i++) {
		//
		// if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
		// System.out.println(str.charAt(i) + " is uppercase char");
		// } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
		// System.out.println(str.charAt(i) + " is lowercase char");
		// } else {
		// System.out.println(str.charAt(i) + " is special or integer char");
		// }
		// }

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 65 && arr[i] <= 90) {
				System.out.println(arr[i] + " is uppercase char");
			} else if (arr[i] >= 97 && arr[i] <= 122) {
				System.out.println(arr[i] + " is lowercase char");
			} else if (arr[i] >= 48 && arr[i] <= 57) {
				System.out.println(arr[i] + " is integer char");
			}else {
				System.out.println(arr[i] + " is special  char");
			}
		}

		System.out.println("end of program.....");
	}

}
