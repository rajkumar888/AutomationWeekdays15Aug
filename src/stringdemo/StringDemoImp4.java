package stringdemo;

public class StringDemoImp4 {

	public static void main(String[] args) {
		
		
		
		String str1="Hello World Java Learning";
		
				char[] ch = str1.toCharArray();
				
				
				for(int i=0; i<ch.length;i++){
					System.out.print(ch[i]);
				}
				System.out.println("\n...............");
				
				for(int i=ch.length-1; i>=0;i--){
					System.out.print(ch[i]);
				}
				
//		
				System.out.println("\n...............");
				String[] str = str1.split(" ");
//				
				for(int i=0; i<str.length;i++){
					System.out.print(str[i]+" ");
				}
				System.out.println("\n...............");
				
				for(int i=str.length-1; i>=0;i--){
					System.out.print(str[i]+" ");
				}
				
				System.out.println("\n...............");
				System.out.println(str1.startsWith("Hel"));
				System.out.println(str1.endsWith("ing"));
		
	}

}
