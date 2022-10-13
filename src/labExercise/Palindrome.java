package labExercise;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="A man, a plan, aa aanal: Panama";
//		String str="4567890w2344";
		str=str.toLowerCase();
		
		str=str.replaceAll("\\W", "");
		System.out.println(str);
		
		boolean flag=true;
		
	
//		String reverse="";
//		
//		for(int i=str.length()-1; i>=0;i--){
//			reverse=reverse+str.charAt(i);
//		}
//		
//		System.out.println(str);
//		System.out.println(reverse);
//		
//		if(str.equals(reverse)){
//			System.out.println("Palindrome");
//		}else{
//			System.out.println("non palindrome");
//		}
		
//		for(int left=0, right=str.length()-1; left<=right; left++,right--){
//			
//			System.out.println(str.charAt(left) +" "+ str.charAt(right));
//			
//			if(str.charAt(left)!=str.charAt(right)){
//				flag=false;
//				break;
//			}
//			
//		}
		
		for(int left=0, right=str.length()-1; left<str.length()/2; left++,right--){
		
		System.out.println(str.charAt(left) +" "+ str.charAt(right));
		
		if(str.charAt(left)!=str.charAt(right)){
			flag=false;
			break;
		}
		
	}
		
		
		
		if(flag){
			System.out.println("Palindrome");
		}else{
			System.out.println("non palindrome");
		}
		
		


	}

}
