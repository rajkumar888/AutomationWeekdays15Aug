package exceptiondemo2;



public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer i = 100;			// primitive data type to object
		Integer xyz = new Integer(200);
		int k=20;
		
		System.out.println(i);
		System.out.println(k);
		System.out.println(xyz);
		
		 Integer obj = new Integer("2526");
		 System.out.println(obj);
		 		 
	      	      
	      int xyz1 = obj;		// object to primitive data type
	      
	      System.out.println(xyz1);
	      
	      String str1 = "12345";
	      
	      int pqr = Integer.parseInt(str1)+1;
	      
	      System.out.println(pqr);
	      
	      
	      int x999 = 1234;
	      
	      String str444 = x999+"";
	      System.out.println(str444);
	      
	      String str555 = String.valueOf(x999);
	      System.out.println(str555);
	      
		
	}

}
