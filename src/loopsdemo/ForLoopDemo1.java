package loopsdemo;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		
		String str="Welcome to year 2022";
		
//		// 2022 year to Welcome
//		
//		String[] strarray = str.split(" ");
//		
//		
//		for(int i=strarray.length-1 ; i>=0 ; i--){
//			System.out.print(strarray[i]+" ");
//		}
		
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
	}

}
