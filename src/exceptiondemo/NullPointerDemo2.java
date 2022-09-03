package exceptiondemo;



public class NullPointerDemo2 {

	
	public static void main(String[] args) {
		
		
		String str=null;
		
		
		
		
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			
			e.printStackTrace();
			
//			System.out.println(e.getMessage());
		}
		
		
		
	
		System.out.println("End of the program........");
	}

}
