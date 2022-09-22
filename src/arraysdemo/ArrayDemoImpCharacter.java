package arraysdemo;

public class ArrayDemoImpCharacter {

	public static void main(String[] args) throws InterruptedException {

//		char[] ch = { 'c', 'w', 'p', 't', 'Q', '1' };
//
//		for (char pppp : ch) {
//			System.out.print(pppp + " ");
//		}
//
//		System.out.println("\n....................");
//		
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]+" ");
//		}
//		System.out.println("\n....................");
//		
//		for (int i = ch.length-1; i>=0 ; i--) {
//			System.out.print(ch[i]+" ");
//		}
		
		char[] chararr="The quick brown fox jumps over the lazy dog".toCharArray();
		
		System.out.println("\n....................");
		
		for (int i = 0; i < chararr.length; i++) {
			System.out.print(chararr[i]+" ");
			Thread.sleep(100);
		}
		
	}

}
