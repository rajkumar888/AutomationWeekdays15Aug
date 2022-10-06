package wrapperclasses;

public class IntegerStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="1000";
		String str1=1000+"";
		
		System.out.println(str+123);
		System.out.println(Integer.valueOf(str)+123);
		
		int x=100;
		
		int y=200;
		
		System.out.println(x+y);
		System.out.println(String.valueOf(x)+String.valueOf(y));
		System.out.println(x+""+y);
		
		System.out.println(Integer.toString(x)+y);

	}

}
