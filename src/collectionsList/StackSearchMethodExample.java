package collectionsList;

import java.util.Stack;

public class StackSearchMethodExample {
	
	
	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		stk.push("Mac Book");
		stk.push("HP");
		stk.push("DELL");
		stk.push("Asus");
		
		System.out.println(stk);
		
		System.out.println("Location "+ stk.search("Asus"));
		System.out.println("Location "+ stk.search("Mac Book"));
	}
}