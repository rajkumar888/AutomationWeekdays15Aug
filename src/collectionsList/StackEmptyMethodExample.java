package collectionsList;

import java.util.Stack;

public class StackEmptyMethodExample {
	
	
	
	public static void main(String[] args) {
		
		
		// creating an instance of Stack class
		Stack<Integer> stk = new Stack<Integer>();
		
		// checking stack is empty or not
		boolean result = stk.empty();
		
		System.out.println("Is the stack empty? " + result);
		System.out.println(stk.size());
		System.out.println(stk.capacity());
		
		
//		// pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		stk.push(78);
		stk.push(113);
		stk.push(444);
		stk.push(333);
		
		System.out.println("................................");
		System.out.println(stk.size());
		System.out.println(stk.capacity());
		System.out.println("Is the stack empty? " + stk.empty());
		
		System.out.println(stk);
//		System.out.println(stk.peek());
		
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk);
		
	}
}